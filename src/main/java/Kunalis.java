import model.Animal;

public class zwierze {
    Animal ptak = new Animal() {
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

}
