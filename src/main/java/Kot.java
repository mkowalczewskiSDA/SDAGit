import model.Animal;

public class Kot implements Animal {

    @Override
    public String getSpecies() {
        return "kot";
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
