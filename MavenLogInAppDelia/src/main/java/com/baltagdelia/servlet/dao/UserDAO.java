package com.baltagdelia.servlet.dao;

import com.baltagdelia.servlet.model.User;

/**
 * Created by DELIA on 6/30/2015.
 */
public interface UserDAO {
    public User findUserByName(String userName);
    public User findUserByNameAndPassword(String userName, String password);
}
