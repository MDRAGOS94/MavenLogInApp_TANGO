package com.traistarudragos.servlet.dao;

import com.traistarudragos.servlet.model.User;

/**
 * Created by DRAGOS_M on 6/30/2015.
 */
public interface UserDAO {
    public User findUserByName(String userName);
    public User findUserByNamePassword(String userName, String userPassword);
}
