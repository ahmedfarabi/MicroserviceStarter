package com.micro.controller;

import lombok.extern.slf4j.Slf4j;
<<<<<<< Updated upstream
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
>>>>>>> Stashed changes
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< Updated upstream

@RestController
@Slf4j
@RequestMapping("/order/")
public class OrderController {

    @GetMapping("/get")
    public ResponseEntity getOrder() {
        return new ResponseEntity<>("order data returns", HttpStatus.CREATED);
=======
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RefreshScope
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private Environment env;
    @GetMapping("/get")
    public ResponseEntity getOrder() {
        log.info("order enable = "+env.getProperty("order-app.enable"));
        if(Boolean.parseBoolean(env.getProperty("order-app.enable"))){
            return new ResponseEntity<>("order data returns", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Service not available", HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/test")
    public String test() {

        String url = "http://ahmadfarabi-11433:9090" + "/api/product/get";

        System.out.println(url);

        String response = new RestTemplate().getForObject(url, String.class);

        return response;

>>>>>>> Stashed changes
    }

}
