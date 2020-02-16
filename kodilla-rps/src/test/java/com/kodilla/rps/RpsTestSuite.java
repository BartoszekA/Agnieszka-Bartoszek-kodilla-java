package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class RpsTestSuite {

    @Test
    public void testCaseRockRock() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(1, 1);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(0, userPoints);
        Assert.assertEquals(0, computerPoints);
    }

    @Test
    public void testCaseRockPaper() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(1, 2);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(0, userPoints);
        Assert.assertEquals(1, computerPoints);
    }

    @Test
    public void testCaseRockScissors() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(1, 3);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(1, userPoints);
        Assert.assertEquals(0, computerPoints);
    }

    @Test
    public void testCasePaperRock() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(2, 1);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(1, userPoints);
        Assert.assertEquals(0, computerPoints);
    }

    @Test
    public void testCasePaperPaper() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(2, 2);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(0, userPoints);
        Assert.assertEquals(0, computerPoints);
    }

    @Test
    public void testCasePaperScissors() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(2, 3);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(0, userPoints);
        Assert.assertEquals(1, computerPoints);
    }

    @Test
    public void testCaseScissorsRock() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(3, 1);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(0, userPoints);
        Assert.assertEquals(1, computerPoints);
    }

    @Test
    public void testCaseScissorsPaper() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(3, 2);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(1, userPoints);
        Assert.assertEquals(0, computerPoints);
    }

    @Test
    public void testCaseScissorsScissors() {
        //Given
        RpsLogic logic = new RpsLogic();
        logic.logic(3, 3);

        //When
        int userPoints = logic.getUserPoints();
        int computerPoints = logic.getComputerPoints();

        //Then
        Assert.assertEquals(0, userPoints);
        Assert.assertEquals(0, computerPoints);
    }
}
