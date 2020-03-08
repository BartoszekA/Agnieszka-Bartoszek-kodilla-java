package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdateHomeworkQueue() {
        //Given
        HomeworkQueue queueUser1 = new HomeworkQueue("Homework queue from user #1");
        HomeworkQueue queueUser2 = new HomeworkQueue("Homework queue from user #2");
        HomeworkQueue queueUser3 = new HomeworkQueue("Homework queue from user #3");
        HomeworkQueue queueUser4 = new HomeworkQueue("Homework queue from user #4");
        HomeworkQueue queueUser5 = new HomeworkQueue("Homework queue from user #5");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor kateKowalski = new Mentor("Kate Kowalski");
        queueUser1.registerObserver(johnSmith);
        queueUser2.registerObserver(johnSmith);
        queueUser3.registerObserver(johnSmith);
        queueUser3.registerObserver(kateKowalski);
        queueUser4.registerObserver(kateKowalski);
        queueUser5.registerObserver(kateKowalski);

        //When
        queueUser1.addHomework("Homework #1");
        queueUser1.addHomework("Homework #2");
        queueUser1.addHomework("Homework #3");
        queueUser2.addHomework("Homework #22");
        queueUser2.addHomework("Homework #23");
        queueUser2.addHomework("Homework #25");
        queueUser3.addHomework("Homework #12");
        queueUser3.addHomework("Homework #14");
        queueUser3.addHomework("Homework #9 updated");
        queueUser4.addHomework("Homework #6");
        queueUser5.addHomework("Homework #19");
        queueUser5.addHomework("Homework #21");
        queueUser5.addHomework("Homework #20");

        //AssertEquals
        assertEquals(9, johnSmith.getUpdateCount());
        assertEquals(7, kateKowalski.getUpdateCount());
    }
}
