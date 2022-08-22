package com.main.controller;

import com.main.dto.SiteContacts;
import com.main.model.*;
import com.main.repo.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class GetController {

    public static final Logger logger= LoggerFactory.getLogger(GetController.class);
    public static volatile int x=0;
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

    @GetMapping("/getUser/{userId}")
    public Users getAllUserById(@PathVariable("userId") Long userId){
        logger.info("Request for user " + userId + " returned-"+x);
        x++;
        return userRepository.findById(userId).orElse(null);
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
