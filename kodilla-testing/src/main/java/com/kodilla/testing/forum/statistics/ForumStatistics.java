package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics;

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        postsPerUser = numberOfPosts / numberOfUsers;
        commentsPerUser = numberOfComments / numberOfUsers;
        commentsPerPost = numberOfPosts / numberOfComments;
    }

    public void showStatistics(){
        System.out.println("Total of users: " + numberOfUsers);
    }
}
