package ua.edu.ucu.adapter.task3.objectAdapters;

import ua.edu.ucu.adapter.task3.БазаДаних;

public class DataBase {
    БазаДаних database;

    public DataBase(){
        this.database = new БазаДаних();
    }

    public DataBase(БазаДаних базаДаних){
        this.database = базаДаних;
    }

    public String getUserData(){
        return database.отриматиДаніКористувача();
    }

    public String getStatisticalData(){
        return database.отриматиСтатистичніДані();
    }
}
