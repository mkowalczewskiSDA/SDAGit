import model.Animal;

public class Main {
    public static void main(String[] args) {
        //TODO implement few animals to use them as examples
<<<<<<< HEAD
        Animal  animal;


=======
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
>>>>>>> 900e93dee8ff37759c89db8000dc6709c0054029
        String predator = animal.isPredator() ? "drapieżnik":"roślinożerca";
        String fly = animal.canFly() ? "potrafi":"nie potrafi";
        System.out.println("Nasze zwierze to: " +animal.getSpecies()+". Jest to " + predator +" i " +fly+" latać");
    }
}
