package com.deepika.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home{


      @GetMapping("/get")
     public String greet(){
            return "Welcome to my world";
      }
}

