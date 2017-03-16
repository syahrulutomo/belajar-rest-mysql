package com.sagecode.belajar.access.restfull.mysql.controller;

import com.sagecode.belajar.access.restfull.mysql.dao.UserRepository;
import com.sagecode.belajar.access.restfull.mysql.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name,
                                      @RequestParam String email)
    {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUser(){
        return userRepository.findAll();
    }
}
