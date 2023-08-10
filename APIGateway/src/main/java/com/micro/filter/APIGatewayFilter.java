package com.micro.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
@Slf4j
public class APIGatewayFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("Global Pre Filter executed ");
        log.info("Request Headers = " + exchange.getRequest().getHeaders());
        //return chain.filter(exchange);
        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
            log.info("Global Post Filter executed: " + exchange.getResponse().getStatusCode());
        }));
    }
}