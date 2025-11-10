package Lesson15.service;

import Lesson15.entity.User;
import Lesson15.exception.NotCorrectPasswordException;
import Lesson15.repository.UserRepository;

public class UserService {
    public User authentificate(String login,String password){
        UserRepository userRepository=new UserRepository();
        User user=userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)){
            return user;
        }
        throw new NotCorrectPasswordException("Пароль не совпадает");
    }
}
