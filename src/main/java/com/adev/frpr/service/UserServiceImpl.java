package com.adev.frpr.service;

import com.adev.frpr.dao.UserDao;
import com.adev.frpr.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;


    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }


    @Override
    public void addUser(User user) {
        this.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {

    }

    @Override
    @Transactional
    public void deleteUser(int id) {

    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return null;
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return this.userDao.listUsers();
    }
}
