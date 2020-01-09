package com.cnu.mentoring.vineet.cdp.designpatterns.singleton;

public class DataBaseConnection {

    private static DataBaseConnection connection;

    private DataBaseConnection(){

    }
    public static synchronized DataBaseConnection getConnection() {
        if (connection == null) {
            connection = new DataBaseConnection();
        }
        return connection;
    }

    public void open() {
        System.out.println("Connection Open");
    }

    public void perform(String query) {
        System.out.println("Perform operation " + query);
    }

    public void close() {
        System.out.println("Closing connection");
    }
}

