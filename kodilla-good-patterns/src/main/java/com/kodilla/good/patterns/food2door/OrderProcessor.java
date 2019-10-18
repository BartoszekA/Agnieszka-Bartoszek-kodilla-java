package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    public void process(Supplier supplier){
        supplier.process();
        InformationService.confirmOrder();
    }
}
