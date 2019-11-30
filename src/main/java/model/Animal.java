package model;

public interface Animal {
    public String getSpecies();
    public boolean isPredator();
    public boolean canFly();


}
public class Pies implements Animal {
    public String size;
    public int weight;

}
    public class Kot implements Animal{
        public String size;
        public int weight;
    }
}