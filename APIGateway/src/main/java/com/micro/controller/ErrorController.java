package com.micro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/")
public class ErrorController {

    @RequestMapping("/error")
    public ResponseEntity getError() {
        return new ResponseEntity<>("product error returns", HttpStatus.BAD_REQUEST);
    }
}
