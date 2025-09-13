package poly.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("먕");
    }

    @Override
    public void move() {
        System.out.println("고냐니 간다옹");
    }
}
