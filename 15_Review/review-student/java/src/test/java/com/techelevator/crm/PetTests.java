package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PetTests {

    @Test
    public void listVaccinations_returns_list_of_vaccinations() {

        Pet sut = new Pet("Spot", "Dalmatian");
        List<String> vaccines = new ArrayList<>();
        vaccines.add("Rabies");
        vaccines.add("Distemper");
        vaccines.add("Parvo");

        sut.setVaccinations(vaccines);
        String vaccinations = sut.listVaccinations();

        Assert.assertEquals("Rabies, Distemper, Parvo", vaccinations);
    }



}
