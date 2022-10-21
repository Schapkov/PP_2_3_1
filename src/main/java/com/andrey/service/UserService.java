package com.andrey.service;

import com.andrey.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void updateUser(User user);

    public User getUserById(int id);

    public void removeUser(int id);


    List<User> getAllUsers();
}
