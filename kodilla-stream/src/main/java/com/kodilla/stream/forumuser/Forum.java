package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Nico", 'M',
                LocalDate.of(2001, 12, 4), 67));
        userList.add(new ForumUser(2, "killer", 'M',
                LocalDate.of(1996, 8, 26), 2673));
        userList.add(new ForumUser(3, "ladyC", 'F',
                LocalDate.of(2004, 1, 16), 1296));
        userList.add(new ForumUser(4, "Marc", 'M',
                LocalDate.of(1989, 5, 5), 14896));
        userList.add(new ForumUser(5, "Mary", 'F',
                LocalDate.of(1993, 2, 28), 6392));
        userList.add(new ForumUser(6, "Adam", 'M',
                LocalDate.of(1995, 1, 15), 0));
        userList.add(new ForumUser(7, "John", 'M',
                LocalDate.of(1986, 11, 10), 26));
        userList.add(new ForumUser(8, "Michelle", 'F',
                LocalDate.of(1990, 3, 28), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
