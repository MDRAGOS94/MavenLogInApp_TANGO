package com.traistarudragos.servlet.dao;

import com.traistarudragos.servlet.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserDAOInMemory implements  UserDAO {
    private final List<User> listOfUsers = new ArrayList<User>() {{
        add(new User("dragos", "dragos"));
        add(new User("delia", "delia"));
        add(new User("andras", "andras"));
        add(new User("florin", "florin"));
        add(new User("test", "test"));
        add(new User("admin", "admin"));
    }};


    public User findUserByName(String userName) {
        for (User user : listOfUsers) {
            if (user.equals(new User(userName))) {
                return user;
            }
        }
        return null;
    }

    public User findUserByNamePassword(String userName, String userPassword) {
        for (User user : listOfUsers) {
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }
}
