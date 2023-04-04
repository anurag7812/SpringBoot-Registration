package com.project.registration.controller;

import com.project.registration.model.User;
import com.project.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/")
    public String homepage(){
        return "index.html";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute User u){
        System.out.println(u);
        userRepository.save(u);
        return "redirect:/";
    }
}
