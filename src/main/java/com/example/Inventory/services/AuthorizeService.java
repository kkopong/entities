package com.example.Inventory.services;

import com.example.Inventory.entities.Authorize;

import java.util.List;

public interface AuthorizeService {

    public List<Authorize> getACCEPT(String accept);

    public List<Authorize> getDECLINE(String decline);
}
