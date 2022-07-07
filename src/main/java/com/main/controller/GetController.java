package com.main.controller;

import com.main.dto.SiteContacts;
import com.main.model.*;
import com.main.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GetController {

    @Autowired
    private MyMainRepo repo;
    @Autowired
    private SitesRepository sitesRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AlertContactsRepository alertContactsRepository;

    @Autowired
    private SiteAlertContactsRepository siteAlertContactsRepository;

    @GetMapping
    public List<MyMainModel> getAll(){
        return repo.findAll();
    }

    @GetMapping("/getAllUser")
    public List<Users> getAllUsers(){
        return userRepository.findAll();
    }



    @GetMapping("/getSites/{userId}")
    public List<Sites> getSites(@PathVariable(value = "userId",required = false) Long userId){
        if(userId == null) return null;
        return sitesRepository.findByUserId(userId);
    }

    @GetMapping("/getContacts/{userId}")
    public List<AlertContacts> getContacts(@PathVariable(value = "userId",required = false) Long userId){
        if(userId == null) return null;
        return alertContactsRepository.findByUserId(userId);
    }

    @GetMapping("/getSiteContacts/{siteId}")
    public List<SiteContacts> getSiteContacts(@PathVariable(value = "siteId",required = false) Long siteId){
        if(siteId==null) return null;
        return siteAlertContactsRepository.findBySiteId(siteId);
    }
}
