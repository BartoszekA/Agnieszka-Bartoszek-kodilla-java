package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Round {
    RpsLogic logic;

    public Round(RpsLogic logic) {
        this.logic = logic;
    }

    public void move(int rounds) {
        String userMove;
        int computerMove;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < rounds; i++) {
            System.out.println("Wybierz ruch:\n1 - kamień\n2 - papier\n3 - nożyce\nx - koniec gry\nn - nowa gra");
            userMove = scanner.next();
            if(userMove.equals("x")) {
                System.out.println("Czy na pewno chcesz wyjść z gry? (y/n)");
                userMove = scanner.next();
                if(userMove.equals("y")) {
                    System.out.println("Gra została zakończona. Do zobaczenia wkrótce!");
                    System.exit(0);
                }
                else if (userMove.equals("n")) {
                    //ciąg dalszy gry
                }
            }
            else if(userMove.equals("n")){
                System.out.println("Czy na pewno chcesz zakończyć tę rozgrywkę? (y/n)");
                userMove = scanner.next();
                if(userMove.equals("y")) {
                    //nowa gra
                }
                else if (userMove.equals("n")) {
                    //ciąg dalszy gry)
                }
            }
            else if (userMove == "1" || userMove == "2" || userMove == "3") {
                int userMoveInt = Integer.valueOf(userMove);
                Random random = new Random();
                computerMove = random.nextInt(3) + 1;
                logic.logic(userMoveInt, computerMove);
            }
        }
    }
}
