package com.example.service;

import java.util.List;

public class UserService {
    public List<User> loadAllUsers(int page, int size) {
        // Pagination is important for performance
        return db.findActive(page, size);
    }
}
