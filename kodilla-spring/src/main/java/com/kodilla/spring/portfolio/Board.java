package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

//    @Autowired
//    private final BoardConfig boardConfig;
//
//    public Board(final BoardConfig boardConfig) {
//        this.boardConfig = boardConfig;
//    }
//
//    public TaskList createToDoList() {
//        return boardConfig.getToDoList();
//    }
}
