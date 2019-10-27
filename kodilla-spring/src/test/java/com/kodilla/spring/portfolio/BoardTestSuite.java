package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAddToDo() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add("Phone call");
        //Then
        String task1 = board.toDoList.tasks.get(0);
        Assert.assertEquals("Phone call", task1);
    }

    @Test
    public void testTaskInProgress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.inProgressList.tasks.add("Send e-mail");
        //Then
        String task1 = board.inProgressList.tasks.get(0);
        Assert.assertEquals("Send e-mail", task1);
    }

    @Test
    public void testTaskDone() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.doneList.tasks.add("Meeting");
        //Then
        String task1 = board.doneList.tasks.get(0);
        Assert.assertEquals("Meeting", task1);
    }
}
