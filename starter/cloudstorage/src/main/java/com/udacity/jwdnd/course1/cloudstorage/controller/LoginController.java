package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";

    }

    @PostMapping("/login")
    public String logoutPage(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("param.logout", "You have been logged out.");
        return "redirect:/login";
    }
}
