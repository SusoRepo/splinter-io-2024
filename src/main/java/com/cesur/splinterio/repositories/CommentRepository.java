package com.cesur.splinterio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesur.splinterio.models.Comment;
import com.cesur.splinterio.models.Incidence;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

    Optional<Incidence> getCommentByIncidence(Long incidenceId);

    List<Comment> findByIncidenceId(Long incidenceId);

}
