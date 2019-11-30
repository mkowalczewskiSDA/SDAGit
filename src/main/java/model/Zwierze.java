package model;

public class Zwierze {
    Animal animal = new Animal() {
        @Override
        public String getSpecies() {
            return "Koala";
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
