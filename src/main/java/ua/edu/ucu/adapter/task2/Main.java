package ua.edu.ucu.adapter.task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Client client = login.login("twitter");
        LocalDate lastActive = client.getLastActiveTime();
        System.out.println(lastActive);
    }
}
