package ua.edu.ucu.adapter.task3.classAdapters;

import ua.edu.ucu.adapter.task3.Авторизація;
import ua.edu.ucu.adapter.task3.БазаДаних;

public class Authorization extends Авторизація {
    public boolean authorize(БазаДаних db){
        return super.авторизуватися(db);
    }
}
