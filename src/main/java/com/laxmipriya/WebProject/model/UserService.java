package com.laxmipriya.WebProject.model;

import java.util.*;
import com.laxmipriya.WebProject.model.*;
public class UserService {
    private List<User> allUsers;
    
    public UserService() {
        allUsers = new ArrayList<>();
        allUsers.add(new User("laxmi priya","female","/img/john_doe.png",1));
        allUsers.add(new User("laxmi","female","/img/jane_doe.png",2));
    }
    public void addUser(String name,String image,String gender) {
        User newUser = new User(name,image,gender,allUsers.size());
        allUsers.add(newUser);
    }
    public List<User> getAllUsers() {
        return allUsers;
    }
    public User getSingleUser(Integer id) {
        return allUsers.get(id);
    }

    public void updateUser(String name,String gender,String image,int idx) {
        User updUser = new User(name,image,gender,allUsers.size());
        allUsers.set(idx,updUser);
    }
    public void deleteUser(int id) {
        allUsers.remove(id);
    }


}
