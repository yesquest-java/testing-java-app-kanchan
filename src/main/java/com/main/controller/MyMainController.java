package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class MyMainController {

    @Autowired
    private GetController getController;

    @GetMapping
    public ModelAndView test(ModelAndView andView){
        andView.setViewName("index");
        return andView;
    }

    @GetMapping("/admin")
    public ModelAndView admin(ModelAndView andView){
        andView.setViewName("admin");
        return andView;
    }

    @GetMapping("/user")
    public ModelAndView user(ModelAndView andView){
        andView.addObject("user",getController.getAllUserById(2L));
        andView.setViewName("user");
        return andView;
    }

}
