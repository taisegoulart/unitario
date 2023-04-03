package dev.ifrs.usecase;

import dev.ifrs.entity.User;
//lembrar que a camada de caso de usa enxerga a de entidade mas o oposto não
public interface IUser {
    public User createUser(String email, String password);
    
}
