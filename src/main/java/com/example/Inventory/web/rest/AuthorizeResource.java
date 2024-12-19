package com.example.Inventory.web.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Inventory.services.AuthorizeService;

@RestController
@RequestMapping("/admin")


public class AuthorizeResource {
    @Autowired AuthorizeService authorizeService;
    @GetMapping("admin/accept")
    public String getAccept(@RequestBody String accept){
        return authorizeService.getACCEPT(accept).toString();
    }

    @GetMapping("/admin/decline")
    public String getDecline(@RequestBody String decline){
        return authorizeService.getDECLINE(decline).toString();
    }
}
