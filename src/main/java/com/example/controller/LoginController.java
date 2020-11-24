package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/loginPage")
    String home(Model model){
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    String checkLogin(Model model, @RequestParam("txtID") String id){
        model.addAttribute("NAME",id);
        return "index";
    }
}
