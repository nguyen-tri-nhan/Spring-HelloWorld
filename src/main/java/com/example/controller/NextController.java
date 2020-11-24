package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NextController {
    @RequestMapping("/next")
    String home(Model model){
        model.addAttribute("NEXT","Default.html");
        model.addAttribute("NEXT_MESSAGE","After click");
        return "default";
    }
}
