package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(1)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("cucumber")
                .ingredient("tomato")
                .ingredient("cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("sesame", bigmac.getBun());
        Assert.assertEquals(1, bigmac.getBurgers());
        Assert.assertEquals("standard", bigmac.getSauce());
        Assert.assertTrue(bigmac.getIngredients().contains("onion"));
        Assert.assertTrue(bigmac.getIngredients().contains("cucumber"));
        Assert.assertTrue(bigmac.getIngredients().contains("tomato"));
        Assert.assertTrue(bigmac.getIngredients().contains("cheese"));
    }
}
