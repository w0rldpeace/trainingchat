package com.example.trainingchat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todo")
    public String print(){

        return "Das ist ein TODO!";
    }
}
