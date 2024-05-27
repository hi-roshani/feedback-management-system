package com.wagh.feedback.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class FeedBackDTO {
    private long id;
    private long userId;
    private String comments;
    private Integer ratings;
}
