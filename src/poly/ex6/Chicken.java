package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("닭이 옷이 꽉 끼면? 꼭끼오");
    }

    @Override
    public void fly() {
        System.out.println("푸드덕 푸드덕");
    }
}
