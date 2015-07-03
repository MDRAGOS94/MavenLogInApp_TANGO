package com.service;

/**
 * Created by Delia on 7/3/2015.
 */
public class PermissionLocator {

    private static PermissionLocator permissionLocator = new PermissionLocator();

    private PermissionLocator (){
    }

    public PermissionLocator getInstance() {
        return permissionLocator;
    }

    public static Permission getPermission() {
        return new Permission();
    }
}
