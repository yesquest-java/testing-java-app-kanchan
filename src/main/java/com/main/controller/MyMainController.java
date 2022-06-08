package com.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class MyMainController {
    @RequestMapping
    public ModelAndView test(ModelAndView andView){
        andView.setViewName("index");
        return andView;
    }
}
