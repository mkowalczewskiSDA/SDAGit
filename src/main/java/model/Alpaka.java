package model;

public class Alpaka implements Animal {
    String spice;
    Boolean isPredator;
    Boolean canFly;

    public Alpaka(String spice, Boolean isPredator, Boolean canFly) {
        this.spice = spice;
        this.isPredator = isPredator;
        this.canFly = canFly;
    }

    @Override
    public String getSpecies() {
        return spice;
    }

    @Override
    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public boolean canFly() {
        return canFly;
    }
}
