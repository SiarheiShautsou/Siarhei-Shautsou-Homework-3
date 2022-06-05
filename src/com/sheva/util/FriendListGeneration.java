package com.sheva.util;

import com.sheva.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.sheva.domain.BooksInfo.authorsNames;
import static com.sheva.domain.BooksInfo.authorsSurnames;

public class FriendListGeneration {

    public static List<User> friendsGenerator(int count){

        List<User> u = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int c = (int) (Math.random() * (authorsSurnames.length - 1));
            u.add(new User(generatorUserID(),authorsNames[c] ,authorsSurnames[c],new ArrayList<>()));
        }

        return u;
    }

    public static List<User> addFriends(List<User> users, int count) {

        for (User tempUser : users) {
            List<User> tempList = tempUser.setFriends(friendsGenerator(count));
            for (User tempListUser : tempList) {
                List<User> lastListUser = tempListUser.setFriends(friendsGenerator(count));
                for (User lastUser : lastListUser) {
                    List<User> users1 = lastUser.setFriends(friendsGenerator(count));
                    for (User user : users1) {
                        user.setFriends(friendsGenerator(count));
                    }
                }
            }
        }

        return users;
    }

    public static long generatorUserID(){

        long minValue = 100000000000L;
        long maxValue = 999999999999L;

        return new Random().nextLong(minValue,maxValue);
    }
}
