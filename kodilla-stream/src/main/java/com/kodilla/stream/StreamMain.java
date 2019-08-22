package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() >= 20)
                .filter(forumUser -> forumUser.getPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
