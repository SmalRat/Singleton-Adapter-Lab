package ua.edu.ucu.adapter.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LoginTest {
    @Test
    public void testLoginMethods(){
        Login login = new Login();
        Client twitterClient = login.login("twitter");
        Assertions.assertEquals(LocalDate.parse("2022-11-21"), twitterClient.getLastActiveTime());
        Assertions.assertEquals("dobosevych@gmail.com", twitterClient.getEmail());
        Assertions.assertEquals("Ukraine", twitterClient.getCountry());

        Client facebookClient = login.login("facebook");
        Assertions.assertEquals(LocalDate.now(), facebookClient.getLastActiveTime());
        Assertions.assertEquals("dobosevych@gmail.com", facebookClient.getEmail());
        Assertions.assertEquals("Ukraine", facebookClient.getCountry());
    }
}
