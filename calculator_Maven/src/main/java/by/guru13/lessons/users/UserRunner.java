package by.guru13.lessons.users;

import by.guru13.lessons.users.User;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ASUS on 19.07.2015.
 */
public class UserRunner {
    public static void main(String[] args) {
        Set<User> users = new HashSet<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));
        users.add(new User("1", "first"));

        for (User user : users){
            System.out.println(user);
        }
    }
}
