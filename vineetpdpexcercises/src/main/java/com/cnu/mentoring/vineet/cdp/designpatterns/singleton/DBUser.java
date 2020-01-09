package com.cnu.mentoring.vineet.cdp.designpatterns.singleton;

import javax.swing.*;

public class DBUser {
//    public static void main(String[] args) {
//        DataBaseConnection connection = DataBaseConnection.getConnection();
//        connection.open();
//        connection.perform("select *");
//        connection.close();
//
//        DataBaseConnection anotherConnection = DataBaseConnection.getConnection();
//        anotherConnection.open();
//        anotherConnection.perform("");
//        anotherConnection.close();
//
//        System.out.println(connection);
//        System.out.println(anotherConnection);
//        System.out.println(connection.equals(anotherConnection));
//    }

    public static void main(String[] args){
        DBManager.Connection connection = DBManager.getConnection();
    }
}
