package DataBase;

import java.sql.*;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:8889/club_management", "root", "root");
    }
}