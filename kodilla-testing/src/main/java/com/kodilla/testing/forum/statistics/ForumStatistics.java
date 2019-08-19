package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;


    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        postsPerUser = numberOfPosts / numberOfUsers;
        commentsPerUser = numberOfComments / numberOfUsers;
        commentsPerPost = (double)numberOfComments / (double)numberOfPosts;
    }

    public void showStatistics(){
        System.out.println("Posts per user: " + postsPerUser);
        System.out.println("Comments per user: " + commentsPerUser);
        System.out.println("Comments per post: " + commentsPerPost);
    }
}
