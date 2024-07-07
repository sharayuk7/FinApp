package com.neueda.finapp.service;

import com.neueda.finapp.model.User;
import com.neueda.finapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        List<User> users = Arrays.asList(
                new User(1L, "Sharayu K", 5600.0, "92894238"),
                new User(2L, "Vedika T", 7830.5, "12345678"),
                new User(3L, "Sushmitha P", 9100.0, "87654321"),
                new User(4L, "Sai P", 1200.0, "11223344"),
                new User(5L, "Jon S", 4500.0, "99887766")
        );
        userRepository.saveAll(users);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}

