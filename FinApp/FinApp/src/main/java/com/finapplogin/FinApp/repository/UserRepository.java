package com.finapplogin.FinApp.repository;

import com.finapplogin.FinApp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByUsernameAndPassword(String username, String password);
}



