package com.loggers.demo.data.connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionHelper.class);
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:oracleDB";
    public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String username = "system";
    public static final String password = "tiger";

    public static Connection getConnection()
    {
        LOGGER.info("Trying to connect to the database...");
        try {
            Class.forName(ORACLE_DRIVER).newInstance();
            return DriverManager.getConnection(URL, username, password);
        } catch (Exception ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}

