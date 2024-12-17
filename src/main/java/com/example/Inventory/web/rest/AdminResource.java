package com.example.Inventory.web.rest;

import com.example.Inventory.entities.Admin;
import com.example.Inventory.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.AdminService;

@RestController
@RequestMapping("/api/v1")
public class AdminResource {
    @Autowired AdminService adminService;
    @GetMapping("/admin/permission")
    public String getAuthorize(@RequestBody String authorize){
        return adminService.getAuthorize(authorize).toString();
    }

    public String getAdminByName(@RequestBody String name){
        return adminService.getAdminByName(name).toString();
    }

    public String getAdminID(@RequestBody String id){
        return adminService.getAdminID(id).toString();
    }

    public Admin addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }

    public Admin addUser(@RequestBody User user){
        return adminService.addUser(user);
    }

    public String getDescription(@RequestBody String description){
        return adminService.getDescription(description).toString();
    }

    public String setAuthorize(@RequestBody String authorize){
        return adminService.setAuthorize(authorize).toString();
    }

    public String getREQUEST_DEVICE(@RequestBody String request_device){
        return adminService.getREQUEST_DEVICE(request_device).toString();
    }

}
