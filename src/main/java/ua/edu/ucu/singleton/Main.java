package ua.edu.ucu.singleton;

import lombok.SneakyThrows;

import java.sql.SQLException;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        User user = new User(2, "Oles", "Oles.Dobosevych", 18);
        user.save();
    }
}
