package ua.edu.ucu.singleton;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User(2, "Oles", "Oles.Dobosevych", 18);
        user.save();
    }
}
