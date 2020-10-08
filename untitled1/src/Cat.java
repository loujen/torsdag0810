public class Cat implements NewAnimals {
    int position;
    int speed = 15;

    @Override
    public void makeSound() {

    }

    @Override
    public void movement(int x) {
        position = position+(x*speed);
        System.out.println("Cat position"+position);
    }
}
