package com.lsis1.grupo10.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.lsis1.grupo10.keys.keys;

/**
 * It's a class that connects to the database
 */

public class DBConnection {

    static final String DBNAME = keys.DBNAME;
    static final String URL = keys.URL;
    static final String USER = keys.USER;
    static final String PASS = keys.PASS;

    /**
     * It creates a connection to the database
     * 
     * @return A connection to the database.
     */
    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException exc) {
            throw new RuntimeException("Error connecting!", exc);
        }
    }
}
