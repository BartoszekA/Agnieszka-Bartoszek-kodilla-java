package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testForumStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new List<String>();
        when(statisticsMock.usersNames()).thenReturn(names);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock)

    }
}
