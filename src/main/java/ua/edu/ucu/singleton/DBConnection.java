package ua.edu.ucu.singleton;

import lombok.Getter;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    private static DBConnection dbconnection;

    @Getter
    private static int connectionsCounter = 0;

    private final Connection connection;

    @SneakyThrows
    private DBConnection() {
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite3");
        connectionsCounter += 1;
    }

    @SneakyThrows
    public void executeQuery(String query) {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query);
        stmt.close();
    }

    @SneakyThrows
    public String executeInfoQuery(String query) {
        String nextInfo;
        StringBuilder totalResult = new StringBuilder();
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(query);
        while (result.next()) {               // Position the cursor                 3
            nextInfo = result.getString(1);             // Retrieve only the first column value
            totalResult.append(nextInfo);
            totalResult.append("\n");
        }
        stmt.close();
        return totalResult.toString();
    }

    public static DBConnection getInstance() {
        if (dbconnection == null) {
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }
}
