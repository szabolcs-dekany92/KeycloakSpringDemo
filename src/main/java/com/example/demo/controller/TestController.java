package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/public")
  public String publicEndpoint(){
    return "Public";
  }

  @GetMapping("/user")
  public String userEndpoint(){
    return "User";
  }

  @GetMapping("/admin")
  public String adminEndpoint(){
    return "Admin";
  }

}
