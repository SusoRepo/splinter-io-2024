package com.cesur.splinterio.services.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.splinterio.models.Comment;
import com.cesur.splinterio.models.Incidence;
import com.cesur.splinterio.models.User;
import com.cesur.splinterio.repositories.CommentRepository;
import com.cesur.splinterio.repositories.IncidenceRepository;
import com.cesur.splinterio.services.CommentService;

public class CommentServiceImpl implements CommentService{

    @Autowired
    IncidenceRepository incidenceRepository;

    @Autowired
    CommentRepository commentRepository;

    @Override
    public void addCommentToIncidence(Long incidenceId, String content, User userId) {
        Optional<Incidence> incidence = incidenceRepository.findById(incidenceId);
        if(incidence.isPresent()){
            Comment comment = new Comment();
            comment.setContent(content);
            comment.setIncidence(incidence.get());
            comment.setAutor(userId);
            comment.setCreatedAt(LocalDateTime.now());
            commentRepository.save(comment);
        }
    }

    @Override
    public List<Comment> listCommentByIncidence(Long incidenceId) {
        return commentRepository.findByIncidenceId(incidenceId);
        
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }

    @Override
    public void modifyComment(Long commentId, String content) {
        Optional<Comment> comment = commentRepository.findById(commentId);
        if(comment.isPresent()){
            comment.get().setContent(content);
            commentRepository.save(comment.get());
        }
    }

}
