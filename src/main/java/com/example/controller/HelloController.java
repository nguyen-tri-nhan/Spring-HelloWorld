package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/")
    String home(Model model){
        model.addAttribute("TITLE","SPRING BOOT - HELLO WORD!");
        model.addAttribute("MESSAGE","WELCOME TO SPRING BOOT");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        model.addAttribute("LIST",list);

        return "index";
    }
}
