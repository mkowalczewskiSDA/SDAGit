import model.Animal;

public class Kot implements Animal {

    @Override
    public String getSpecies() {
        return null;
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
