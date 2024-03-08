package com.loggers.demo;

import com.loggers.demo.data.connection.ConnectionHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger("loggers-demo-logs");

    public static void main(String[] args) {
        try {
            Connection con = ConnectionHelper.getConnection();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
    }
}
