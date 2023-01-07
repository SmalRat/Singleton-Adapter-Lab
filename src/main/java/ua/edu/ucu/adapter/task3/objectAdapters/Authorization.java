package ua.edu.ucu.adapter.task3.objectAdapters;

import ua.edu.ucu.adapter.task3.БазаДаних;

public class Authorization {
    public boolean authorize(DataBase database){
        database.getUserData();
        return true;
    }

    public boolean authorize(БазаДаних базаДаних){
        базаДаних.отриматиДаніКористувача();
        return true;
    }
}
