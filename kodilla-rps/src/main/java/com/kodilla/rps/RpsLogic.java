package com.kodilla.rps;

public class RpsLogic {
    private int userPoints = 0;
    private int computerPoints = 0;

    public int getUserPoints() {
        return userPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public void logic(int userMove, int computerMove) {
        if(userMove == 1 && computerMove == 1) {
            System.out.println("Wybrałeś kamień.\nKomputer też wybrał kamień.\n");
        }
        else if(userMove == 1 && computerMove == 2) {
            System.out.println("Wybrałeś kamień.\nKomputer wybrał papier.\nPapier przykrywa kamień.\n");
            computerPoints++;
        }
        else if(userMove == 1 && computerMove == 3) {
            System.out.println("Wybrałeś kamień.\nKomputer wybrał nożyce.\nKamień zgniata nożyce.\n");
            userPoints++;
        }
        else if(userMove == 2 && computerMove == 1) {
            System.out.println("Wybrałeś papier.\nKomputer wybrał kamień.\nPapier przykrywa kamień.\n");
            userPoints++;
        }
        else if(userMove == 2 && computerMove == 2) {
            System.out.println("Wybrałeś papier.\nKomputer też wybrał papier.\n");
        }
        else if(userMove == 2 && computerMove == 3) {
            System.out.println("Wybrałeś papier.\nKomputer wybrał nożyce.\nNożyce tną papier.\n");
            computerPoints++;
        }
        else if(userMove == 3 && computerMove == 1) {
            System.out.println("Wybrałeś nożyce.\nKomputer wybrał kamień.\nKamień zgniata nożyce.\n");
            computerPoints++;
        }
        else if(userMove == 3 && computerMove == 2) {
            System.out.println("Wybrałeś nożyce.\nKomputer wybrał papier.\nNożyce tną papier.\n");
            userPoints++;
        }
        else if(userMove == 3 && computerMove == 3) {
            System.out.println("Wybrałeś nożyce.\nKomputer też wybrał nożyce.\n");
        }

    }

    public boolean isEnd (int rounds, String name) {
        System.out.println("Aktualna liczba punktów:\n" + name + ": " + userPoints + "\nKomputer: " + computerPoints);
        System.out.println();
        if ((userPoints == rounds) || (computerPoints == rounds)) {
            if (userPoints > computerPoints) {
                System.out.println("Wygrywa " + name);
            } else {
                System.out.println("Wygrywa komputer.");
            }
            return true;
        } else return false;
    }
}
