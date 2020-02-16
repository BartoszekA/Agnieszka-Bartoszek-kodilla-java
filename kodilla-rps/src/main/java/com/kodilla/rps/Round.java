package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Round {
    RpsLogic logic;
    int rounds;
    String name;

    public Round(RpsLogic logic, int rounds, String name) {
        this.logic = logic;
        this.rounds = rounds;
        this.name = name;
    }

    public boolean makeMoves() {
        String userMove;
        int computerMove;
        Scanner scanner = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            System.out.println("Wybierz ruch:\n1 - kamień\n2 - papier\n3 - nożyce\nx - koniec gry\nn - nowa gra");
            userMove = scanner.next();
            if (userMove.equals("1") || userMove.equals("2") || userMove.equals("3")) {
                int userMoveInt = Integer.parseInt(userMove);
                Random random = new Random();
                computerMove = random.nextInt(3) + 1;
                logic.logic(userMoveInt, computerMove);
                end = logic.isEnd(rounds, name);

            } else if (userMove.equals("x")) {
                System.out.println("Czy na pewno chcesz wyjść z gry? (y/n)");
                userMove = scanner.next();
                if (userMove.equals("y")) {
                    System.out.println("Gra została zakończona. Do zobaczenia wkrótce!");
                    end = true;
                } else if (userMove.equals("n")) {
                    return makeMoves();
                }
            } else if (userMove.equals("n")) {
                System.out.println("Czy na pewno chcesz zakończyć tę rozgrywkę? (y/n)");
                userMove = scanner.next();
                if (userMove.equals("y")) {
                    end = true;
                    return true;
                } else if (userMove.equals("n")) {
                    return makeMoves();
                }
            }
        }
        return false;
    }
}
