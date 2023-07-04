package com.javatodev.app.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonAPIResponse {
    private String message;
}
