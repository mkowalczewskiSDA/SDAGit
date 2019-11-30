package model;

public class KlasaPierwszaBe implements Animal {

    @Override
    public String getSpecies() {
        return "Jeżozwierz";
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
