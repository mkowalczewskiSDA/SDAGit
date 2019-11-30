import model.Animal;

public class Main {
    public static void main(String[] args) {
        //TODO implement few animals to use them as examples
        Animal  animal;


        String predator = animal.isPredator() ? "drapieżnik":"roślinożerca";
        String fly = animal.canFly() ? "potrafi":"nie potrafi";
        System.out.println("Nasze zwierze to: " +animal.getSpecies()+". Jest to " + predator +" i " +fly+" latać");
    }
}
