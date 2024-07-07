package com.neueda.finapp.repository;

import com.neueda.finapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void saveAll(List<User> users) {
        this.users.addAll(users);
    }

    public void save(User user) {
        this.users.add(user);
    }
}

