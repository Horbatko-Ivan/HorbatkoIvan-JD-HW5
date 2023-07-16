package org.goit.hw4.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static final Database INSTANCE = new Database();
    private static final String URL = "jdbc:h2:~/test";
    private Connection connection;

    private Database() {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(URL, "sa", "");
            System.out.println("Database connected: " + !connection.isClosed());
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Database getINSTANCE() {
        return INSTANCE;
    }

    public static void sendSQLExecute(String sql) throws SQLException {
        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement = conn.createStatement();
        statement.execute(sql);
        statement.close();
        database.closeConnection();
    }

    public static void sendSQLExecuteUpdate(String sql) throws SQLException {
        Database database = Database.getINSTANCE();
        Connection conn = database.getConnection();
        Statement statement = conn.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        database.closeConnection();
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
