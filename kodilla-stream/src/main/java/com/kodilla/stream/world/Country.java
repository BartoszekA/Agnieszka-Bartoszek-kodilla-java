package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(final String name, final BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        return getPeopleQuantity() != null ? getPeopleQuantity().equals(country.getPeopleQuantity()) : country.getPeopleQuantity() == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (getPeopleQuantity() != null ? getPeopleQuantity().hashCode() : 0);
        return result;
    }
}
