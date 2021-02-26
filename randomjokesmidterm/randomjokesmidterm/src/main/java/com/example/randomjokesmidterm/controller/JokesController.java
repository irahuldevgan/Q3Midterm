package com.example.randomjokesmidterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JokesController {

    @RequestMapping("/joke")
    //@ResponseBody
    public String JokesController(@ModelAttribute("joke") Model model){

        return "index";
    }
}


//    @RequestMapping("/")
//    public String myController(@ModelAttribute("joke") Model model){
//        Return “ind