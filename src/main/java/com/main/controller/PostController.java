package com.main.controller;

import com.main.model.*;
import com.main.repo.AlertContactsRepository;
import com.main.repo.MyMainRepo;
import com.main.repo.SiteAlertContactsRepository;
import com.main.repo.SitesRepository;
import com.main.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    @Autowired
    private MyMainRepo repo;
    @Autowired
    private UsersService usersService;

    @Autowired
    private SitesRepository sitesRepository;

    @Autowired
    private AlertContactsRepository contactsRepository;

    @Autowired
    private SiteAlertContactsRepository siteAlertContactsRepository;

    @PostMapping
    public MyMainModel saveModel(@RequestBody MyMainModel model) {
        return repo.save(model);
    }



    @PostMapping("/add/user")
    public MyMainModel addUser(@RequestBody(required = false) MyMainModel model) {
        if(model == null) return null;
        return repo.save(model);
    }

    /**
     * This api used for login user registration
     * @author Kanchan
     * @param user
     * @return user
     */
    @PostMapping("/addUser")
    public Users addUser(@RequestBody(required= false) Users user){
        if(user==null) return null;
        return  usersService.addUser(user);
    }

    @PostMapping("/addSite")
    public Sites addSite(@RequestBody(required= false)  Sites site){
        if(site==null) return null;
        return sitesRepository.save(site);
    }

    @PostMapping("/addContact")
    public AlertContacts addContact(@RequestBody(required= false) AlertContacts contact){
        if(contact==null) return null;
        return contactsRepository.save(contact);
    }

    @PostMapping("/addSiteContacts")
    public SiteAlertContacts addSiteContacts(@RequestBody(required= false)  SiteAlertContacts contact){
        if(contact==null) return null;
        return siteAlertContactsRepository.save(contact);
    }


}
