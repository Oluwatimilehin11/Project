package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MyController {

    @Autowired
    StudentService ss;

    @GetMapping("/")
    public String home() {
        return "home";   //home.jsp
    }

    @GetMapping("/register")
    public String register() {

        return "register";     //register.jsp
    }


    @GetMapping("/viewdata")
    public String viewData() {

        return "viewdata";     //viewdata.jsp
    }

    @GetMapping("/login")
    public String login() {
        return "login";     //login.jsp
    }


    @PostMapping("/saveform")
    public void saveform(@ModelAttribute Student s)
    {
        ss.registration(s);

    }
    @GetMapping("/test")
    public String test() {
        return "Spring Boot is running!";
    }

}
