package model;

public class Alpaka implements Animal {
    String spice;
    Boolean isPredator;
    Boolean canFly;
    
    @Override
    public String getSpecies() {
        return "Alpaka";
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
