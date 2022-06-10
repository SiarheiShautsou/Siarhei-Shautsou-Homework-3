package com.sheva.util;

import com.sheva.domain.User;

import java.util.List;

public class UserFriendPrint {

    public static void printFriends(User user) {

        List<User> users = user.getFriends();
        System.out.print(user.getName() + " -> ");
        for (User user1 : users) {
            System.out.print(user1.getName() + " ");
        }
        System.out.println();
    }

    public static void printMoreFriends(User user, int level) {

        if (level != 0) {
            for (int i = 0; i < user.getFriends().size(); i++) {
                printFriends(user.getFriends().get(i));
            }
            level--;
            for (int i = 0; i < user.getFriends().size(); i++) {
                printMoreFriends(user.getFriends().get(i), level);
            }

        }
    }
}
