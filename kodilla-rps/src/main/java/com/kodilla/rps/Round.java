package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Round {

    public void move(int rounds) {
        String userMove;
        int computerMove;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < rounds; i++) {
            System.out.println("Wybierz ruch:\n1 - kamień\n2 - papier\n3 - nożyce\nx - koniec gry\nn - nowa gra");
            userMove = scanner.next();
            System.out.println(userMove);
            if(userMove.equals("x")) {
                System.out.println("Czy na pewno chcesz wyjść z gry? (y/n)");
                userMove = scanner.next();
                if(userMove == "y") {
                    System.out.println("Gra została zakończona. Do zobaczenia wkrótce!");
                    System.exit(0);
                }
                else if (userMove == "n") {
                    //ciąg dalszy gry
                }
            }
            else if(userMove == "n"){
                System.out.println("Czy na pewno chcesz zakończyć tę rozgrywkę? (y/n)");
                userMove = scanner.next();
                if(userMove == "y") {
                    //nowa gra
                }
                else if (userMove == "n") {
                    //ciąg dalszy gry
                }
            }
            else if (userMove == "1" || userMove == "2" || userMove == "3") {
                RpsLogic logic = new RpsLogic();
                Random random = new Random();
                computerMove = random.nextInt(3) + 1;
                logic.logic(userMove, computerMove);
            }
        }
    }
}
