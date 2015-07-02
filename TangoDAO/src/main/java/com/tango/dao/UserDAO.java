package com.tango.dao;

import com.tango.model.User;

public interface UserDAO {
    public User findUserByName(String userName);
    public User findUserByNamePassword(String userName, String userPassword);

}
