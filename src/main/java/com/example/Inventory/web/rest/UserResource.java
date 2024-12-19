package com.example.Inventory.web.rest;


import com.example.Inventory.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Inventory.services.UserService;

@RestController
@RequestMapping("/user")

public class UserResource {
    @Autowired UserService userService;

    @GetMapping("user/id")
    public String getUserId(@RequestBody String id){
        return userService.getUSERID(id).toString();
    }

    @GetMapping("user/name")
    public String getUserName(@RequestBody String name){
        return userService.getUSERName(name).toString();
    }

    @PutMapping("user/request_device")
    public String setREQUEST_DEVICE(@RequestBody String request_device){
        return userService.setREQUEST_DEVICE(request_device).toString();
    }

    @PostMapping("user/user")
    public User addUser(@RequestBody User user){
        return userService.addUSER(user);
    }
}
