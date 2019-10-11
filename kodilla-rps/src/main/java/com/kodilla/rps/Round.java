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
            if(userMove == "x") {
                System.out.println("Czy na pewno chcesz przerwać grę? (y/n)");
                userMove = scanner.next();
                if(userMove == "y") {
                    System.out.println("Gra została przewana. Do zobaczenia wkrótce!");
                    //koniec gry
                }
                else if (userMove == "n") {
                    //ciąg dalszy gry
                }
            }
            else if(userMove == "n"){
                System.out.println("Czy na pewno chcesz zakończyć grę? (y/n)");
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
//            } else {
//                System.out.println("Spróbuj jeszcze raz");
//                move(rounds);
//                //należy zmienić argument, bo zacznie liczyć od nowa ilość rund
            }
        }
    }
}
