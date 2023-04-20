package com.netology.hw2_1_autorizationservice.service;

import com.netology.hw2_1_autorizationservice.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final int NUM_USERS = 10;
    private final String NAME = "user-";
    private final String PASSWORD = "qwerty_";
    private List<User> userList;

    public UserRepository() {
        userList = new ArrayList<>();
        for (int i = 0; i < NUM_USERS; i++) {
            userList.add(new User(NAME + i,
                    PASSWORD + (int) (Math.random() * NUM_USERS),
                    getAuthorization()));
        }
    }

    private List<AuthorizationService.Authorities> getAuthorization() {
        List<AuthorizationService.Authorities> list = new ArrayList<>();
        int len = AuthorizationService.Authorities.values().length;

        for (int i = 0; i < Math.random() * len; i++) {
            int rand = (int) (Math.random() * len);
            if (!list.contains(AuthorizationService.Authorities.values()[rand]))
                list.add(AuthorizationService.Authorities.values()[rand]);
        }
        return list;
    }

    public List<AuthorizationService.Authorities> getUserAuthorities(String user, String password) {
        for (int i = 0; i < userList.size(); i++) {
            User userObj = userList.get(i);
            if (userObj.getUser().equals(user) && userObj.getPassword().equals(password))
                return userObj.getAuthoritiesList();
        }
        return null;
    }

}