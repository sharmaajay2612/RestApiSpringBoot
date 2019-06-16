package com.gfg.ajay.SpringRestDemo.userdata;

import com.gfg.ajay.SpringRestDemo.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserData {
    public static Map<Long, User> userMap= new HashMap<>();

    static{
        User user1= new User(0L,"Ajay","Sharma" );
        User user2= new User(1L,"Abhishek","Sharma" );
        User user3= new User(2L,"Anshuman","Sharma" );
        User user4= new User(3L,"Pushkar","Katiyar" );
        userMap.put(0L,user1);
        userMap.put(1L,user2);
        userMap.put(2L,user3);
        userMap.put(3L,user4);

    }
}
