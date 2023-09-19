package com.example.munozpage;

public class Factoids {
    private int id;
    private String weapon;
    private String quote;

    public int getID(){
        return id;
    }

    public void setID(int newID){
        this.id = newID;
    }

    public String getWeapon(){
        return weapon;
    }

    public void setWeapon(String newWeapon){
        this.weapon = newWeapon;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String newQuote) {
        this.quote = newQuote;
    }
}