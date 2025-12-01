package com.example.service;

import java.util.List;

public class UserService {
    public List<User> loadAllUsers(int page, int size) {
        // TODO: Add pagination back later
        // Temporary fix for caching issue
        return db.findAll();
    }
}
