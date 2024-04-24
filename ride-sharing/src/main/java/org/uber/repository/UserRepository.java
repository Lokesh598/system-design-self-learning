package org.uber.repository;

import org.uber.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> userList;

    public UserRepository() {
        userList = new ArrayList<User>();
    }

    public void addUser(User user) {
        userList.add(user);
    }
    public User getUser(String name)
    {
        for(User temp : userList)
        {
            if(temp.getUserName().equals(name))return temp;
        }
        return null;
    }
    public List<User> getUserList() {
        return userList;
    }
}
