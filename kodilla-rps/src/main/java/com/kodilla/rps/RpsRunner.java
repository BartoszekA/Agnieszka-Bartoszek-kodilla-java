package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        String name;
        int rounds;
        boolean shouldStartNewGame = false;
        do {
            System.out.println("Jak masz na imię?");
            Scanner in = new Scanner(System.in);
            name = in.nextLine();
            System.out.println("Witaj, " + name + ". Do ilu wygranych gramy? (1-10)");
            in = new Scanner(System.in);
            rounds = in.nextInt();
            while (!(rounds > 0 && rounds <= 10)) {
                System.out.println("Podana liczba nie mieści się w zakresie 1-10. Spróbuj jeszcze raz");
                in = new Scanner(System.in);
                rounds = in.nextInt();
            }
            System.out.println("Maksymalna liczba wygranych to: " + rounds);
            RpsLogic logic = new RpsLogic();
            Round round = new Round(logic, rounds, name);
            shouldStartNewGame = round.makeMoves();
        } while (shouldStartNewGame);
    }
}
