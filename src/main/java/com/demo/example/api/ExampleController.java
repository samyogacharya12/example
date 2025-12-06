package com.demo.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {



    @GetMapping("/example")
    public String getData() {
        return "Hello World";
    }
}
