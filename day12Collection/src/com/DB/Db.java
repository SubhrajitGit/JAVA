package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
    private static Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/Dummy";
    private static final String user = "subhrajit";
    private static final String password = "Subhrajit2002@";

    public static Connection createConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
