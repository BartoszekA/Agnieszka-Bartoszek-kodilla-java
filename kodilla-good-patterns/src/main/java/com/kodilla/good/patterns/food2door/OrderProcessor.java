package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private final OrderRetriever orderRetriever;

    public OrderProcessor(OrderRetriever orderRetriever) {
        this.orderRetriever = orderRetriever;
    }

    public void process(Supplier supplier){
        System.out.println(orderRetriever.retrieve());
        supplier.process();
        InformationService.confirmOrder();
    }
}
