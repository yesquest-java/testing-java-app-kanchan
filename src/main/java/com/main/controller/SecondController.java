package com.main.controller;

import com.main.model.MyMainModel;
import com.main.repo.MyMainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SecondController {

    @Autowired
    private MyMainRepo repo;

    @PostMapping
    public MyMainModel saveModel(@RequestBody MyMainModel model) {
        return repo.save(model);
    }

    @GetMapping
    public List<MyMainModel> getAll(){
        return repo.findAll();
    }

    @PostMapping("/add/user")
    public MyMainModel addUser(@RequestBody(required = false) MyMainModel model) {
        if(model == null) {
            model=new MyMainModel();
            model.setName("?");
            return model;
        }
        return repo.save(model);
    }
}
