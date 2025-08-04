package com.projetoSpring.ProjetoSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/users")
    public String users() {
        return "users";
    }
    
    @GetMapping("/products")
    public String products() {
        return "products";
    }
    
    @GetMapping("/orders")
    public String orders() {
        return "orders";
    }
    
    @GetMapping("/categories")
    public String categories() {
        return "categories";
    }
}