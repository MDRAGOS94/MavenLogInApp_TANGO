package com.traistarudragos.servlet.model;

/**
 * Created by DRAGOS_M on 6/30/2015.
 */
public class User {
    private String userName;
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object obj) {
        return ((User)obj).getUserName().equals(this.getUserName());
    }
}
