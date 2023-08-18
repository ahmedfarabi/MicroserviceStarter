package com.micro.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Data
@RefreshScope
@ConfigurationProperties("product-app")
public class ProductConfigurationProperties {

    //@JsonProperty("enable")
    private String enable;
}
