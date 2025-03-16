package com.example.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {

    String hello(String name);
}
