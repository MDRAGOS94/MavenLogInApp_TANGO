package com.traistarudragos.servlet.handlers;

public interface AuthenticationHandlerLogic {
    boolean checkLogin(String userName, String userPassword);
}
