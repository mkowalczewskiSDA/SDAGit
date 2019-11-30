package model;

public class imponderabilia implements Animal {

    @Override
    public String getSpecies() {
        return "Jeżozwierzak";
    }

    @Override
    public boolean isPredator() {
        return true;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
