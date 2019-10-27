package com.kodilla.rps;

public class RpsLogic {
    int userPoints = 0;
    int computerPoints = 0;

    public void logic(String userMove, int computerMove) {
        if (userMove == "1" && computerMove == 1) {
            //remis
        } else if (userMove == "1" && computerMove == 2) {
            computerPoints++;
            //tu wpisz cos
        } else if (userMove == "1" && computerMove == 3) {
            userPoints++;
            //tu wpisz cos
        } else if (userMove == "2" && computerMove == 1) {
            userPoints++;
            //xxx
        } else if (userMove == "2" && computerMove == 2) {
            //remis
        } else if (userMove == "2" && computerMove == 3) {
            computerPoints++;
            //jjj
        } else if (userMove == "3" && computerMove == 1) {
            computerPoints++;
            //ddd
        } else if (userMove == "3" && computerMove == 2) {
            userPoints++;
            //www
        } else if (userMove == "3" && computerMove == 3) {
            //remis
        }
    }
}
