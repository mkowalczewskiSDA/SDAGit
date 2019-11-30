package model;

import model.Animal;

public class Jeżozwierz implements Animal {


    @Override
    public String getSpecies() {
        return "Jezozwierz";
    }

    @Override
    public boolean isPredator() {
        return false;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}