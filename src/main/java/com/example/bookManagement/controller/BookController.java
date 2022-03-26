package com.example.bookManagement.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class BookController {

    @PostMapping("getBook")
    public CompletableFuture<String> show(){
        System.out.println("Hi");
        return CompletableFuture.completedFuture("Science");
    }
}
