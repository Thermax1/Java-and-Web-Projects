package com.example.munozpage;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    private final JsonData dataParse;

    public GameController(JsonData dataParse) {
        this.dataParse = dataParse;
    }

    @GetMapping("/heroes")
    public List<Heroes> getHeroes() throws IOException {
        return dataParse.getHeroes();
    }

    @GetMapping("/factoids")
    public List<Factoids> getFactoids() throws IOException {
        return dataParse.getFactoids();
    }

    @GetMapping("/heroes/{id}")
    public Heroes getHeroById(@PathVariable int id) throws IOException {
        List<Heroes> heroes = dataParse.getHeroes();
        return heroes.stream()
                .filter(hero -> hero.getID() == id)
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/factoids/{id}")
    public Factoids getFactoidById(@PathVariable int id) throws IOException {
        List<Factoids> factoids = dataParse.getFactoids();
        return factoids.stream()
                .filter(factoid -> factoid.getID() == id)
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/heroes/{id}/factoids")
    public List<Factoids> getFactoidsForHero(@PathVariable int id) throws IOException {
        List<Heroes> heroes = dataParse.getHeroes();
        Heroes hero = heroes.stream()
                .filter(h -> h.getID() == id)
                .findFirst()
                .orElse(null);
        if (hero == null) {
            return null;
        }
        List<Factoids> factoids = dataParse.getFactoids();
        return factoids.stream()
                .filter(factoid -> factoid.getID() == hero.getID())
                .toList();
    }

    @GetMapping("/heroes/{heroId}/factoids/{factoidId}")
    public Factoids getFactoidForHeroById(@PathVariable int heroId, @PathVariable int factoidId) throws IOException {
        List<Factoids> factoids = getFactoidsForHero(heroId);
        if(factoids == null) {
            return null;
        }
        return factoids.stream()
                .filter(factoid -> factoid.getID() == factoidId)
                .findFirst()
                .orElse(null);
    }
}