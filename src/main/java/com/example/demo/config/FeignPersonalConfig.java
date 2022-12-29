package com.example.demo.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class FeignPersonalConfig {

    @Bean
    public RequestInterceptor requestInterceptor(HttpServletRequest request) {
        return requestTemplate -> {
            requestTemplate.header("headerFakeProFeign", request.getHeader("Teste"));
        };
    }
}
