package poly.ex4;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("멍");
    }

    @Override
    public void move() {
        System.out.println("가나디 걸어가용 총총");
    }
}
