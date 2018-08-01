package com.patrick.authtoken.service;

import com.patrick.authtoken.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
