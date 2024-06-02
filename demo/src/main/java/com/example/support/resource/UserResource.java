package com.example.support.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = { "/api/users" })
public class UserResource {

    @GetMapping("/user")
    public String showUser() {
        System.out.println("User Resource");
        return "Application User";
    }
    

}
