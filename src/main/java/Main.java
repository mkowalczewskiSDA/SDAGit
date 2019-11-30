import model.Alpaka;
import model.Animal;

public class Main {
    public static void main(String[] args) {
        //TODO implement few animals to use them as examples
        Animal animal = new Alpaka("Alpaka", false, false);

        String predator = animal.isPredator() ? "drapieżnik":"roślinożerca";
        String fly = animal.canFly() ? "potrafi":"nie potrafi";
        System.out.println("Nasze zwierze to: " +animal.getSpecies()+". Jest to " + predator +" i " +fly+" latać");
    }
}
