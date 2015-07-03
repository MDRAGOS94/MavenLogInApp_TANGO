package com.servicetest;

import com.service.Permission;
import com.tango.model.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Delia on 7/3/2015.
 */
public class PermissionTest {
    Permission per=new Permission();

    @Test
    public void testUserHasAccesToPageTrue() {
        Assert.assertTrue(per.userHasAccessToPage("/adminOnly","dragos"));


    }

    @Test
    public void testUserHasAccesToPageFalse() {
        Assert.assertFalse(per.userHasAccessToPage("/adminOnl", "dragos"));


    }

}
