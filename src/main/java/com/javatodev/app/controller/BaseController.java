package com.javatodev.app.controller;

import com.javatodev.app.dto.CommonAPIResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BaseController {
    @GetMapping
    public ResponseEntity<CommonAPIResponse> baseApiPath() {
        return ResponseEntity.ok(CommonAPIResponse
            .builder()
            .message("Spring Boot ECS API - Javatodev")
            .build());
    }
}
