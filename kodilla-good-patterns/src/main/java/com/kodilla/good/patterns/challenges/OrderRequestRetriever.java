package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Smith");
        Item item = new Item("book");

        return new OrderRequest(user, item);
    }
}
