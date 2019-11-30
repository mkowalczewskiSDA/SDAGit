import model.Animal;

public class Pterodaktyl implements Animal {

    @Override
    public String getSpecies() {
        return null;
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

