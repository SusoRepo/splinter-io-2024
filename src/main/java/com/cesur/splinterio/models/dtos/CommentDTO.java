package com.cesur.splinterio.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentDTO {

    private Long id;
    private String content;
    private String createdAt;
    private String deletedAt;
    private Long autorId;
    private Long incidenceId;

}
