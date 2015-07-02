package com.tango.dao;

public class TangoDAOLocator {
    private static TangoDAOLocator tangoDAOLocator = new TangoDAOLocator();

    private TangoDAOLocator() {
    }

    public TangoDAOLocator getInstance() {
        return tangoDAOLocator;
    }

    public static UserDAOInMemory getUserDAOInMemory() {
        return new UserDAOInMemory();
    }

}
