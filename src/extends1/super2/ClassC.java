package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10); // 얘는 ClassB에 기본 생성자가 정의되어 있으니까 부모 생성자를 직접 적어줘야함
        System.out.println("ClassC 생성자");
    }
}
