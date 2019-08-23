package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(country -> country.getPeopleQuantity().stream())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
