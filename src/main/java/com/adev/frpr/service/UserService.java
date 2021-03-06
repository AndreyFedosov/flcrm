package com.adev.frpr.service;

import com.adev.frpr.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public User getUserById(int id);
    public List<User> listUsers();

}
