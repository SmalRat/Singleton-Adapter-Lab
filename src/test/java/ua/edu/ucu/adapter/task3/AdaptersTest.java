package ua.edu.ucu.adapter.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.adapter.task3.classAdapters.Authorization;
import ua.edu.ucu.adapter.task3.classAdapters.DataBase;
import ua.edu.ucu.adapter.task3.classAdapters.ReportBuilder;

public class AdaptersTest {
    @Test
    public void testAdapters(){
        DataBase dataBase = new DataBase();
        БазаДаних базаДаних = new БазаДаних();

        Authorization authorization = new Authorization();
        Авторизація авторизація = new Авторизація();

        ReportBuilder rb_legacy = new ReportBuilder(базаДаних);
        ReportBuilder rb_new = new ReportBuilder(dataBase);

        Assertions.assertEquals(true, authorization.authorize(базаДаних));
        Assertions.assertEquals(true, authorization.authorize(dataBase));
        Assertions.assertEquals(true, авторизація.авторизуватися(базаДаних));

        Assertions.assertEquals("hello", dataBase.retrieveUserData());
        Assertions.assertEquals("hello", dataBase.отриматиДаніКористувача());
        Assertions.assertEquals("hello2", dataBase.retrieveStatisticData());
        Assertions.assertEquals("hello2", dataBase.отриматиСтатистичніДані());
    }
}
