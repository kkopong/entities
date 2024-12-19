package com.example.Inventory.web.rest;

import com.example.Inventory.entities.Admin;
import com.example.Inventory.entities.Description;
import com.example.Inventory.entities.User;
import com.example.Inventory.services.AdminService;
import com.example.Inventory.services.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
@RestController

public class AdminResource {
    @Autowired AdminService adminService;

    @PostMapping("admin/admin")
    public Admin addAdmin(@RequestBody Admin description){
        return adminService.addAdmin(description);
    }

    @GetMapping("admin/id")
    public String getAdminID(@RequestBody String id){
        return adminService.getAdminID(id).toString();
    }

    @PostMapping("admin/user")
    public Admin addUser(@RequestBody User user){
        return adminService.addUser(user);
    }

    @GetMapping("admin/name")
    public String getAdminByName(@RequestBody String name){
        return adminService.getAdminByName(name).toString();
    }

    @GetMapping("admin/description")
    public String getDescription(@RequestBody String description){
        return adminService.getDescription(description).toString();
    }

    @PutMapping("admin/authorize")
    public String setAuthorize(@RequestBody String authorize){
        return adminService.setAuthorize(authorize).toString();
    }

    @GetMapping("admin/authorize")
    public String getAuthorize(@RequestBody String description){
        return adminService.getAuthorize(description).toString();
    }

    @GetMapping("admin/request_device")
    public String getREQUEST_DEVICE(@RequestBody String request_device){
        return adminService.getREQUEST_DEVICE(request_device).toString();
    }
}
