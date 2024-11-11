package com.cesur.splinterio.services;

import java.util.List;

import com.cesur.splinterio.models.Comment;
import com.cesur.splinterio.models.User;

public interface CommentService {
    /*
     * 1. Añadir comentario ligado a incidencia
     * 2. Listar comentario
     * 3. Borrar comentario
     * 4. Modificar comentario
     */

    void addCommentToIncidence(Long incidenceId, String content, User userId);
    List<Comment> listCommentByIncidence(Long incidenceId);
    void deleteComment(Long commentId);
    void modifyComment(Long commentId, String content);

}
