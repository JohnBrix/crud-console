package com.crud.database;

import javax.swing.*;
import java.sql.DriverManager;

public class Database {

    public static java.sql.Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/crud_simple", "root", "");
            return connection;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Connected!");
            return null;
        }
    }
}