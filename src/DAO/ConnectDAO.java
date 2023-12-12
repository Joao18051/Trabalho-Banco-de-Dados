package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public abstract class ConnectDAO{
    private static final String URL = "jdbc:postgresql://localhost:5432/oftamo_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "senha";

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

