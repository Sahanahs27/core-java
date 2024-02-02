package com.xworkz.backapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankUtils {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection =  DriverManager.getConnection(DBProperties.URL.value,DBProperties.USER.value, DBProperties.PASSWORD.value);
           return connection;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
       //return null;
    }
}

