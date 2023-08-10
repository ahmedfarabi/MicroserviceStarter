package com.micro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/order/")
public class OrderController {

    @GetMapping("/get")
    public ResponseEntity getOrder() {
        return new ResponseEntity<>("order data returns", HttpStatus.CREATED);
    }

}
