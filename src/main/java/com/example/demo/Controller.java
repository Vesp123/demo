package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getString() {
        return "string";
    }

    @GetMapping
    public int getInt() {
        return 5;
    }

    //check

}
