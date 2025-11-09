package Lesson15.repository;

import Lesson15.entity.User;
import Lesson15.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static List<User> users = new ArrayList<>();

    static {
        User user1 = new User("vasya", "12345", "vasya", "vasilev");
        User user2 = new User("petya", "54321", "petr", "petrov");
        User user3 = new User("igor", "11111", "igor", "igorev");
        User user4 = new User("sergei", "00000", "sergei", "sergeev");
        User user5 = new User("ilya", "22222", "ilya", "iliev");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);


    }
    public  User searchUserByLogin(String login){
        for (User user:users){
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Такого логина нет");

    }
}
