package com.cnu.mentoring.vineet.cdp.designpatterns.singleton;

public class DBManager {

    private static Connection connection;

    public static Connection getConnection() {
        if(connection == null){
            connection = new Connection();
        }
        return connection;
    }

    private class connectionManager{}

    public static class Connection {

    }
}
