package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kate = new Millenials("Kate Smith");
        User john = new YGeneration("John Williams");
        User jessica = new ZGeneration("Jessica Brown");

        //When
        String kateShares = kate.share();
        System.out.println("Kate shares on: " + kateShares);
        String johnShares = john.share();
        System.out.println("John shares on: " + johnShares);
        String jessicaShares = jessica.share();
        System.out.println("Jessica shares on: " + jessicaShares);

        //Then
        Assert.assertEquals("Facebook", kateShares);
        Assert.assertEquals("Twitter", johnShares);
        Assert.assertEquals("Snapchat", jessicaShares);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User kate = new Millenials("Kate Smith");

        //When
        String kateShares = kate.share();
        System.out.println("Kate shares on: " + kateShares);
        kate.setSocialPublisher(new TwitterPublisher());
        kateShares = kate.share();
        System.out.println("Kate shares now on: " + kateShares);

        //Then
        Assert.assertEquals("Twitter", kateShares);
    }

}
