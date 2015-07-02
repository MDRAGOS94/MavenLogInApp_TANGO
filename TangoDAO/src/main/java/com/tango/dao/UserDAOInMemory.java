package com.tango.dao;

import com.tango.model.Permission;
import com.tango.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAOInMemory implements UserDAO {
    protected UserDAOInMemory() {
    }

    private final List<User> listOfUsers = new ArrayList<User>() {{
        add(new User("dragos", "dragos", new ArrayList<Permission>() {{ add(new Permission("/adminOnly", "admin")); }}));
        add(new User("delia", "delia"));
        add(new User("andras", "andras"));
        add(new User("florin", "florin"));
        add(new User("admin", "admin"));
    }};

    public List<User> getListOfUsers() {
        return listOfUsers;
    }

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

}
