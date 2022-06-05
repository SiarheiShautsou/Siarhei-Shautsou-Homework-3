package com.sheva.util;

import com.sheva.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserFriendPrint {

    public static void printFriends(User user){

        List<User> users = user.getFriends();
        System.out.print(user.getName() + " -> ");
        for (User user1 : users) {
            System.out.print(user1.getName() + " ");
        }
        System.out.println();
    }

    public static void printMoreFriends(List<User> users){

        List<User> users1 = new ArrayList<>();
        for (User user : users) {
            printFriends(user);
            users1.addAll(user.getFriends());
        }
        List<User> users2 = new ArrayList<>();
        for (User user1 : users1) {
            printFriends(user1);
            users2.addAll(user1.getFriends());
        }
        List<User> users3 = new ArrayList<>();
        for (User user2 : users2) {
            printFriends(user2);
            users3.addAll(user2.getFriends());
        }
        for (User user3 : users3) {
            printFriends(user3);
        }
    }
}
