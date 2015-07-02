package com.tango.model;

import java.util.List;

public class User {
    private String userName;
    private String userPassword;
    private List<Permission> listOfPermissions;

    public User(String userName, String userPassword, List<Permission> listOfPermissions) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.listOfPermissions = listOfPermissions;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public List<Permission> getListOfPermissions() {
        return listOfPermissions;
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
