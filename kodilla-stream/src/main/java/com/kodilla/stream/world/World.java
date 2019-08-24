
package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continents.remove(continent);
    }

    public List<Continent> getContinents() {
        return new ArrayList<>(continents);
    }

    public BigDecimal getPeopleQuantity() {
        return getContinents().stream()
                .flatMap(c -> c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

