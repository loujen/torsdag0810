import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<NewAnimals> AllAnimals = new ArrayList<NewAnimals>();
        AllAnimals.add(new Cat());
        AllAnimals.add(new Dog());
        AllAnimals.add(new Pig());

        for(NewAnimals i:AllAnimals) {
            i.movement( x 20);
        }
    }
}
