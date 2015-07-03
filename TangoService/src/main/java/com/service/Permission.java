package com.service;

import com.tango.dao.TangoDAOLocator;
import com.tango.model.User;

/**
 * Created by Delia on 7/2/2015.
 */
public class Permission implements PermissionLogic {

    protected Permission() {
    }

    public boolean userHasAccessToPage(String url, String userName)
    {
        User user=new User(userName);
        user=TangoDAOLocator.getUserDAOInMemory().findUserByName(userName);
        for(com.tango.model.Permission p: user.getListOfPermissions())
            if(p.getUrl().equals(url))
                return true;
        return false;
    }
}