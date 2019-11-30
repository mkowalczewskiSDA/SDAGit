import model.Animal;

public class Zwierze implements Animal {

    Animal animal = new Animal() {
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
    };

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