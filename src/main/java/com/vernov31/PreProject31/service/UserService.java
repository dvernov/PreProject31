package com.vernov31.PreProject31.service;


import com.vernov31.PreProject31.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void deleteUser(Long id);
    void saveUser(User user);
    User getUser(Long id);
}
