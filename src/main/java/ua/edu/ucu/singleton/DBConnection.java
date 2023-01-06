package ua.edu.ucu.singleton;

import lombok.Getter;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static DBConnection dbconnection;

    @Getter
    private int connectionsCounter = 0;

    private final Connection connection;

    @SneakyThrows
    private DBConnection() {
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
        connectionsCounter += 1;
    }


    public void executeQuery(String query) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }

    public static DBConnection getInstance() {
        if (dbconnection == null) {
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }
}
