package com.example.munozpage;

import java.util.List;

public class DataWrap {
    private List<Heroes> heroes;
    private List<Factoids> factoids;

    public List<Heroes> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Heroes> heroes) {
        this.heroes = heroes;
    }

    public List<Factoids> getFactoids() {
        return factoids;
    }

    public void setFactoids(List<Factoids> factoids) {
        this.factoids = factoids;
    }
}