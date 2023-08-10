package com.micro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeoutException;

@RestController
@Slf4j
@RequestMapping("/product/")
public class ProductController {

    @GetMapping("/get")
    public ResponseEntity getProduct() throws Exception {
        //Thread.sleep(6000);
        throw new TimeoutException("time out");
        //return new ResponseEntity<>("product data returns", HttpStatus.BAD_REQUEST);
        //return "product data returns";
    }
}
