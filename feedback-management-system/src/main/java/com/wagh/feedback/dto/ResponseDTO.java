package com.wagh.feedback.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ResponseDTO {
    private Integer status;
    private String message;

}
