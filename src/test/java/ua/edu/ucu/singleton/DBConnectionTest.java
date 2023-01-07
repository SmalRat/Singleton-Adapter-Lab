package ua.edu.ucu.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DBConnectionTest {
    @Test
    public void testConnectionsNumber(){
        DBConnection dbConnection = DBConnection.getInstance();
        dbConnection.executeQuery("DROP TABLE USER");
        dbConnection.executeQuery("create table user" +
                "(" +
                "    id    integer primary key autoincrement," +
                "    name  text," +
                "    email text," +
                "    age integer" +
                ");");

        User user1 = new User(1, "Y Prytula", "prytula@gamail.com", 18);
        User user2 = new User(2, "O Dobosevych", "dobosevych@gamail.com", 18);

        user1.save();
        user2.save();

        Assertions.assertEquals(DBConnection.getConnectionsCounter(), 1);
    }
}
