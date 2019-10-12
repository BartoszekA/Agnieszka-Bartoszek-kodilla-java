package com.kodilla.good.patterns.food2door;


public class Supplier implements OrderProcessor {
    String name;
    String address;
    String phone;

    public Supplier(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void process(){

    }
}
