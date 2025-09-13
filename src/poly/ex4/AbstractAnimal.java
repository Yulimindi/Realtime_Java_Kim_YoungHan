package poly.ex4;

public abstract class AbstractAnimal { // 순수 추상 클래스 (모든 메서드가 추상 메서드)
    // 이는 다형성을 위한 부모 타입으로써 껍데기 역할만 제공
    // 상속 시 자식은 모든 메서드를 오버라이딩 해야함
    // 인스턴스를 생성할 수 없음

    public abstract void sound();
    public abstract void move();

}
