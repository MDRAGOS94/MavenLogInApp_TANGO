package com.baltagdelia.servlet.test;

import com.baltagdelia.servlet.dao.UserDAO;
import com.baltagdelia.servlet.dao.UserDAOInMemory;
import com.baltagdelia.servlet.model.User;
import org.junit.Assert;
import org.junit.Test;

public class UserDAOTest {
    UserDAO userDao;

    @Test
    public void testFindUserByName() {

        userDao = new UserDAOInMemory();
        Assert.assertEquals(new User("test"), userDao.findUserByName("test"));

    }

    @Test
    public void testFindUserByNameAndPassword() {

        userDao = new UserDAOInMemory();
        Assert.assertEquals(new User("test","test"), userDao.findUserByNameAndPassword("test","test"));

    }

    // jtsl
}
