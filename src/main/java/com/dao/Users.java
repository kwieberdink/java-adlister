package com.dao;

import com.models.User;

public interface Users {
    User findByUsername(String username);
    Long insert(User user);
}
