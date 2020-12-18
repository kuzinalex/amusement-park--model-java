package controller;

import user.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> userList;
    public void add(User user){}
    public void change(User user){}
    public void delete(User user){}

    public List<User> getUserList() {
        return userList;
    }

    public UserManager() {
        this.userList = new ArrayList<>();
    }
}
