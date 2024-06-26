package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store= new ArrayList<>();

    public UserService() {
        store.add(new User(1L,"kiran", "ghale@kora.com"));
        store.add(new User(2L,"ram", "ram@gmail.com"));
        store.add(new User(3L,"harry", "garry@kora.com"));
        store.add(new User(4L,"geta", "geta@gmail.com"));

    }

    public List<User> getUsers() {
        return  this.store;
    }
}
