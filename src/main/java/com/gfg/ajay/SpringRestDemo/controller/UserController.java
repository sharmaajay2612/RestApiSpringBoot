package com.gfg.ajay.SpringRestDemo.controller;

import com.gfg.ajay.SpringRestDemo.model.User;
import com.gfg.ajay.SpringRestDemo.userdata.UserData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
public class UserController {
    Map<Long, User> userMap = UserData.userMap;
    @GetMapping("/users")
    public List<User> getAllUser(){

        List<User> userList= new ArrayList<>();
        //itersate over hashmap using enrty set
        for(Map.Entry<Long,User> myEntry :userMap.entrySet()){
            User user= myEntry.getValue();
            userList.add(user);
        }

        return userList;

    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
       // Map<Long, User> userMap = UserData.userMap;
        if(userMap.containsKey(id)){
            return userMap.get(id);
        }else{
            return null;
        }
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable Long id){
        if(userMap.containsKey(id)){
            userMap.remove(id);
            return true;
        }else{
            return false;
        }
    }

    @PostMapping("/user")
    public User updateUser(@RequestBody User user){
      //  Map<Long, User> userMap = UserData.userMap;
        Long id=user.getId();
        if(userMap.containsKey(id)){
            return null;
        }else{
            userMap.put(id,user);
            return userMap.get(id);
        }
    }

    @PutMapping("/user")
    public User createUser(@RequestBody User user){
       // Map<Long, User> userMap = UserData.userMap;

        Long id=user.getId();
        if(userMap.containsKey(id)){
            userMap.put(id,user);
            return userMap.get(id);
        }else{
            return null;
        }
    }
}
