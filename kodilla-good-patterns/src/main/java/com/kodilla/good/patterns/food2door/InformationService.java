package com.kodilla.good.patterns.food2door;

public class InformationService {

    public void confirmOrder(Supplier supplier) {
        System.out.println("Zamówienie zostało zrealizowwane");
    }

    public void rejectOrder(Supplier supplier) {
        System.out.println("Zamówienie nie zostało zrealizowane");
    }
}
