package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeatController {
    @RequestMapping("/")
    public String home() {
        return "index.html";
    }
}
