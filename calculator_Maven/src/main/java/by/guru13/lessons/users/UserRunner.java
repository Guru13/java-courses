package by.guru13.lessons.users;

import by.guru13.lessons.users.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ASUS on 19.07.2015.
 */
public class UserRunner {
    public static void main(String[] args) {
//        Set<User> users = new HashSet<User>();
//        users.add(new User("1", "first"));
//        users.add(new User("2", "second"));
//        users.add(new User("1", "first"));

//        for (User user : users){
//            System.out.println(user);
//        }
//
//        System.out.println(users.contains(new User("2", "second")));

        Map<String, User> userMap = new HashMap<String, User>();
        userMap.put("User1",new User("1","first"));
        userMap.put("User2",new User("2","second"));
        userMap.put("User3",new User("3","third"));
        userMap.put("User4",new User("4","fourth"));
        userMap.put("User5",new User("4","fourth"));
        System.out.println(userMap);
        for (Map.Entry<String, User> map : userMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }



    }
}
