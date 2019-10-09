package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new SMSInformationService(), new ItemOrderService(), new ItemOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
