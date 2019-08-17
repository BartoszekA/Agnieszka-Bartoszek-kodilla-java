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

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        int postsPerUser = forumStatistics.calculateAdvStatistics(statisticsMock).postsPerUser;
        int commentsPerUser = forumStatistics.calculateAdvStatistics(statisticsMock).commentsPerUser;
        int commentsPerPost = forumStatistics.calculateAdvStatistics(statisticsMock).commentsPerPost;

        //Then
        Assert.assertEquals(0, postsPerUser);
        Assert.assertEquals(0, commentsPerUser);
        Assert.assertEquals(0, commentsPerPost);
    }




}
