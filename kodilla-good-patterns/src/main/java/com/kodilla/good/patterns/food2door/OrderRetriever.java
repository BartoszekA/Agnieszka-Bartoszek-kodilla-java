package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {

    public List<Product> retrieve() {
        ArrayList<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Prod1"));

        return listOfProducts;
    }
}
