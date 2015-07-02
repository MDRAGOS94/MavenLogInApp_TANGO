package com.traistarudragos.servlet.handlers;

public class AuthenticationHandler implements AuthenticationHandlerLogic {
    private static final String USER_NAME = "admin";
    private static final String USER_PASSWORD = "admin";

    public boolean checkLogin(String userName, String userPassword) {
        if (userName.equals(USER_NAME) == true && userPassword.equals(USER_PASSWORD) == true) {
            return true;
        }
        return false;
    }

}
