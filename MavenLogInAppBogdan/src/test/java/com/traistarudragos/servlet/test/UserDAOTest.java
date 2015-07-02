package com.traistarudragos.servlet.test;

import com.traistarudragos.servlet.dao.UserDAO;
import com.traistarudragos.servlet.dao.UserDAOInMemory;
import com.traistarudragos.servlet.model.User;
import org.junit.Assert;
import org.junit.Test;

public class UserDAOTest {
    UserDAO userDao;

    @Test
    public void testFindUserByName() {

        userDao = new UserDAOInMemory();
        Assert.assertEquals(new User("test"), userDao.findUserByName("test"));

    }

    // jtsl
}
