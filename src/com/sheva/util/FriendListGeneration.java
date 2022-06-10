package com.sheva.util;

import com.sheva.domain.User;

import java.util.ArrayList;
import java.util.List;

import static com.sheva.domain.BooksInfo.authorsNames;
import static com.sheva.domain.BooksInfo.authorsSurnames;
import static com.sheva.util.StudentInfoGeneration.generatorID;

public class FriendListGeneration {

    public static List<User> friendsGenerator(int count) {

        List<User> u = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int c = (int) (Math.random() * (authorsSurnames.length - 1));
            u.add(new User(generatorID(), authorsNames[c], authorsSurnames[c], new ArrayList<>()));
        }

        return u;
    }

    public static void addFriends(User user, int count, int level) {

        if (level != 0) {
            for (int i = 0; i < user.getFriends().size(); i++) {
                user.getFriends().get(i).setFriends(friendsGenerator(count));

            }
            level--;
            for (int i = 0; i < user.getFriends().size(); i++) {
                addFriends(user.getFriends().get(i), count, level);
            }
        }
    }
}
