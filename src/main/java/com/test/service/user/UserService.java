package com.test.service.user;

import com.test.model.User;

public interface UserService {

    User getUserByUsername(String username);
    
    void saveUser(String username, String password);

}
