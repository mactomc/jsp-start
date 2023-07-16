package com.example.test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class DummyController {

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    
}
