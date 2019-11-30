package model;

public class Krokodyl implements Animal {

    private String species;
    private boolean predator;
    private boolean canFly;

    public Krokodyl(String species, boolean predator, boolean canFly) {
        this.species = species;
        this.predator = predator;
        this.canFly = canFly;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public boolean isPredator() {
        return predator;
    }

    @Override
    public boolean canFly() {
        return canFly;
    }
}
