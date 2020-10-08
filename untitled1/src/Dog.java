public class Dog implements NewAnimals {
    int position;
    int speed = 10;

    @Override
    public void makeSound() {

    }

    @Override
    public void movement(int x) {
        position = position+(x*speed);
        System.out.println("Dog position"+position);
    }
}
