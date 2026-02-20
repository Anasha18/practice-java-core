package org.java.core.lesson6.practiceDB.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbManager {
    public static Connection getConnection(
            Config con
    ) throws SQLException {
        return DriverManager.getConnection(
                con.url(),
                con.user(),
                con.pass()
        );
    }
}
