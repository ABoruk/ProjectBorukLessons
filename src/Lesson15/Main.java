package Lesson15;

import Lesson15.entity.User;
import Lesson15.exception.NotCorrectPasswordException;
import Lesson15.exception.UserNotFoundException;
import Lesson15.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        authentificate1();

//        Map<Integer, String> entry = new HashMap<>();
//        entry.put(0, "string1");
//        entry.put(2, "string2");
//        entry.put(3, "string3");
//        entry.put(4, "string4");
//        entry.put(6, "string5");
//        Set<Integer> keys = entry.keySet();
//        var result = 1;
//        for (Integer i : keys) {
//            if (i > 5) {
//                System.out.println(entry.get(i));
//            }
//            if (i == 0) {
//                System.out.println(entry.values());
//            }
//            String val = entry.get(i);
//            if (val.length() > 5) {
//                result = i * result;
//
//            }
//
//        }
//System.out.println(result);
//    }



    }
    public static void authentificate1() {
        try {
            UserService userService = new UserService();
            userService.authentificate("vasya", "78345");
        } catch (NotCorrectPasswordException notCorrectPasswordException) {
            System.out.println("Вы не прошли аутентификцию");
        } catch (UserNotFoundException userNotFoundException) {
            System.out.println("Нет пользователя");
        }

    }
}
