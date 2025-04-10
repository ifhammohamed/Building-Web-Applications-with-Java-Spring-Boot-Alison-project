package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}

@RestController
@RequestMapping(path = "/test")
class TestController{

    @RequestMapping( path = "/hello/{name}", method = RequestMethod.GET)
    public String SayHello(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }
}