package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("The driving task", "home", "car");
            case SHOPPINGTASK:
                return new ShoppingTask("The shopping task", "fruits", 1.5);
            case PAINTINGTASK:
                return new PaintingTask("The painting task", "blue", "sky");
            default:
                return null;
        }
    }
}
