package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");

        Country country1 = new Country("France", 66993000);
        Country country2 = new Country("Germany", 83019200);
        Country country3 = new Country("Spain", 46934632);
        Country country4 = new Country("China", 1387160730);
        Country country5 = new Country("India", 1324009090);
        Country country6 = new Country("Japan", 12689100);
        Country country7 = new Country("Egypt", 96983083);
        Country country8 = new Country("Morocco", 33337529);
        Country country9 = new Country("Tunisia", 10982754);

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        continent2.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);

        continent3.addCountry(country7);
        continent3.addCountry(country8);
        continent3.addCountry(country9);

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal(3062109118);
        Assert.assertEquals(expectedPeopleQuantity, World.getPeopleQuantity());
    }
}
