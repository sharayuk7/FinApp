package com.finapplogin.FinApp.services;

import com.finapplogin.FinApp.model.User;
import com.finapplogin.FinApp.repository.UserRepository;
import jakarta.persistence.Transient;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveMyUser(User user){

        userRepository.save(user);
    }


}
