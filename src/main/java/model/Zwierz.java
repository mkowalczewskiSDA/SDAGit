package model;


public class Zwierz implements Animal {
    @Override
    public String getSpecies() {
        return "Skowronek";
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