package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent = (Continent) o;

        if (name != null ? !name.equals(continent.name) : continent.name != null) return false;
        return countries != null ? countries.equals(continent.countries) : continent.countries == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (countries != null ? countries.hashCode() : 0);
        return result;
    }
}
