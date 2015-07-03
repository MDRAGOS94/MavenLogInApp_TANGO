package com.service;

import com.tango.dao.TangoDAOLocator;
import com.tango.model.User;

/**
 * Created by Delia on 7/2/2015.
 */
public class Permission implements PermissionLogic {



    public boolean userHasAccessToPage(String url, String userName)
    {
        //User user=new User(userName);
        User user=TangoDAOLocator.getUserDAOInMemory().findUserByName(userName);
        if(user.getListOfPermissions()==null)
            return false;
        for(com.tango.model.Permission p: user.getListOfPermissions())
            if(p.getUrl().equals(url))
                return true;
        return false;
    }
}
