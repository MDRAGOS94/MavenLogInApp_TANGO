package com.service;

/**
 * Created by Delia on 7/2/2015.
 */
public interface PermissionLogic {
    public boolean userHasAccessToPage(String url, String userName);
}
