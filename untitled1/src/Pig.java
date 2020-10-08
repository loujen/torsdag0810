public class Pig implements NewAnimals {
    int position;
    int speed = 5;

    @Override
    public void makeSound() {

    }

    @Override
    public void movement(int x) {
    position = position+(x*speed);
    System.out.println("Pig position"+position);
    }
}
