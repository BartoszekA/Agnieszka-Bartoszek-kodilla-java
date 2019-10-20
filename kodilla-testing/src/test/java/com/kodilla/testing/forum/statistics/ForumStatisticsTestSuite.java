package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testForumStatistics1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        int posts = 0;
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = forumStatistics.getPostsPerUser();
        double commentsPerUser = forumStatistics.getCommentsPerUser();
        double commentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
    }

    @Test
    public void testForumStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        while (names.size() < 100) {
            names.add("");
        }
        int posts = 1000;
        int comments = 500;

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = forumStatistics.getPostsPerUser();
        double commentsPerUser = forumStatistics.getCommentsPerUser();
        double commentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(1000 / 100, postsPerUser, 0);
        Assert.assertEquals(500 / 100, commentsPerUser, 0);
        Assert.assertEquals((double) 500 / 1000, commentsPerPost, 0);
    }

    @Test
    public void testForumStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<String>();
        while (names.size() < 100) {
            names.add("");
        }
        int posts = 1000;
        int comments = 1500;
        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = forumStatistics.getPostsPerUser();
        double commentsPerUser = forumStatistics.getCommentsPerUser();
        double commentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        Assert.assertEquals(1000 / 100, postsPerUser, 0);
        Assert.assertEquals(1500 / 100, commentsPerUser, 0);
        Assert.assertEquals((double) 1500 / 1000, commentsPerPost, 0);
    }
}
