package com.kodilla.good.patterns.challenges;

public class ListGenerator {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        MovieStore.getFinalList(movieStore.getMovies());
    }
}
