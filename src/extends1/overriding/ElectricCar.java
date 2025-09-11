package extends1.overriding;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전");
    }

    @Override
    public void move() {
        System.out.println("전기차 아주아주 빠르게~~~~~~~~~~~~~~~~~ 이동");
    }
    // @ = 애노테이션, 주석과 비슷한데 프로그램이 읽을 수 있는 특별한 주석이라고 생각하면 됨

}
