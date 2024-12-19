package com.example.Inventory.web.rest;


import com.example.Inventory.entities.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Inventory.services.DescriptionService;

import java.util.Date;

@RequestMapping("/description")
@RestController

public class DescriptionResource {
    @Autowired DescriptionService descriptionService;

    @GetMapping("description/manu_Date")
        public String getManuDate(@RequestBody Date manu){
        return descriptionService.getManuDate(manu).toString();
    }

    @GetMapping("description/product_name")
    public String getProductName(@RequestBody String name){
        return descriptionService.getProductName(name).toString();
    }

    @GetMapping("description/quantity")
    public String getQuantity(@RequestBody int quantity){
        return descriptionService.getQuantity(quantity).toString();
    }

    @GetMapping("description/color")
    public String getColor(@RequestBody String color){
        return descriptionService.getColor(color).toString();
    }

    @PostMapping("description/description")
    public Description addDescription(@RequestBody Description description){
        return descriptionService.addDescription(description);
    }
}
