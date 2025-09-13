package poly.ex5;

public class Dog implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("멍");
    }

    @Override
    public void move() {
        System.out.println("가나디 지나가용~");
    }
}
