package com.jocota.DeDuplication.Dedupliction.contoller;

import com.jocota.DeDuplication.Dedupliction.entities.UserDetails;
import com.jocota.DeDuplication.Dedupliction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserDetails user){
        return userService.saveUser(user);
    }

    @GetMapping("/authenticateUser")
    public boolean authenticateUser(@RequestBody UserDetails user) {
        return userService.authenticateUser(user);
    }
}
