package com.xworkz.bookutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDtoUtils {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playstore","root","saanu@123");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        //return null;

    }
}
