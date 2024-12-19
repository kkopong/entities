package com.example.Inventory.services;

import com.example.Inventory.entities.User;

import java.util.List;

public interface UserService {

    public User addUSER(User user);

    public List<User> getUSERID(String id);

    public List<User> getUSERName(String name);

    public List<User> setREQUEST_DEVICE(String request_device);
}
