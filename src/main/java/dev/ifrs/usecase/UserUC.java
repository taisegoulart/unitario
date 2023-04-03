package dev.ifrs.usecase;

import dev.ifrs.entity.User;

public class UserUC implements IUser {

    @Override
    public User createUser(String email, String password) {

        if (email.isBlank() || password.isBlank()){
            throw new IllegalArgumentException();
        }
        else{
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            return user;
         }

    }
    
}
