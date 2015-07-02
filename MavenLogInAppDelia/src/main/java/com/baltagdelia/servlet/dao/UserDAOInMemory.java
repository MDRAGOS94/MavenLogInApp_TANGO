package com.baltagdelia.servlet.dao;

import com.baltagdelia.servlet.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserDAOInMemory implements  UserDAO {
    private final List<User> listOfUsers = new ArrayList<User>() {{
        add(new User("dragos", "dragos"));
        add(new User("delia", "delia"));
        add(new User("andras", "andras"));
        add(new User("florin", "florin"));
        add(new User("admin", "admin"));
        add(new User("test", "test"));
    }};


    public User findUserByName(String userName) {
        for (User user : listOfUsers) {
            if (user.equals(new User(userName))) {
                return user;

            }
        }
        return null;
    }

    public User findUserByNameAndPassword(String userName, String password)
    {
        for (User user : listOfUsers) {
            if (user.equals(new User(userName,password))) {
                return user;

            }
        }
        return null;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }
}
