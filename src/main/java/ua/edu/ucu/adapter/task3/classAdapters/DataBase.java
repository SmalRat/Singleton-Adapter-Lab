package ua.edu.ucu.adapter.task3.classAdapters;

import ua.edu.ucu.adapter.task3.БазаДаних;

public class DataBase extends БазаДаних {
    public String retrieveUserData(){
        return super.отриматиДаніКористувача();
    }

    public String retrieveStatisticData(){
        return super.отриматиСтатистичніДані();
    }
}
