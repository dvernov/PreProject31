package com.vernov31.PreProject31.DAO;

import com.vernov31.PreProject31.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void deleteUser(Long id);
    void saveUser(User user);
    User getUser(Long id);

}
