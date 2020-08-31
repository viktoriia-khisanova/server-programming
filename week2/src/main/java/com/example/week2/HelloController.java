package com.example.week2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}