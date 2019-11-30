package model;

import model.Animal;

public class KlasaPawla implements Animal {
    @Override
    public String getSpecies() {
        return "Gad";
    }

    @Override
    public boolean isPredator() {
        return true;
    }

    @Override
    public boolean canFly() {
        return false;
    }


}