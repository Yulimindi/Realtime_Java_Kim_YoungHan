package poly.ex5;

public class Caw implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("나는 소 음메");
    }

    @Override
    public void move() {
        System.out.println("지나간다잉");
    }
}
