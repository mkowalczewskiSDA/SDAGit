package model;

public class Pies implements Animal {
    @Override
    public String getSpecies() {
        return "Pies";
    }

    @Override
    public boolean isPredator() {
        return false;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
