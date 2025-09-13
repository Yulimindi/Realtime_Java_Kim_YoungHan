package poly.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("먕");
    }

    @Override
    public void move() {
        System.out.println("고냐니 움직여용");
    }
}
