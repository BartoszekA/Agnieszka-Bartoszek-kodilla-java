package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public abstract class AbstractTaxiDecorator implements TaxiOrder {
    private final TaxiOrder taxiOrder;

    protected AbstractTaxiDecorator(TaxiOrder taxiOrder) {
        this.taxiOrder = taxiOrder;
    }

    @Override
    public BigDecimal getCost() {
        return taxiOrder.getCost();
    }

    @Override
    public String getDescription() {
        return taxiOrder.getDescription();
    }
}
