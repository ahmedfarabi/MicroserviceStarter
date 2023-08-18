package com.micro.controller;

<<<<<<< Updated upstream
import lombok.extern.slf4j.Slf4j;
=======
import com.micro.config.ProductConfigurationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
    @GetMapping("/get")
    public ResponseEntity getProduct() throws Exception {
        //Thread.sleep(6000);
        throw new TimeoutException("time out");
        //return new ResponseEntity<>("product data returns", HttpStatus.BAD_REQUEST);
        //return "product data returns";
=======
    @Autowired
    ProductConfigurationProperties configurationProperties;

    @Autowired
    private Environment environment;

    @GetMapping("/get")
    public ResponseEntity getProduct() throws Exception {
        log.info("product enable = "+environment.getProperty("product-app.enable"));
        if(Boolean.parseBoolean(configurationProperties.getEnable())){
            //Thread.sleep(6000);
            //throw new TimeoutException("time out");
            return new ResponseEntity<>("product data returns from load balancer", HttpStatus.OK);
            //return "product data returns";
        }
        else {
            return new ResponseEntity<>("Service not available from load balancer", HttpStatus.BAD_REQUEST);
        }
>>>>>>> Stashed changes
    }
}
