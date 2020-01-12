package com.example.h2jpamvcwebdemo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("now", LocalDate.now());    
        return "index";
    }
}