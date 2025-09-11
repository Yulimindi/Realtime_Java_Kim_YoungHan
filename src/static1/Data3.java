package static1;

public class Data3 {
    public String name; // instance 변수. 인스턴스를 만들 때마다 새로 만들어짐 (인스턴스 안에 소속됨)
    public static int count; // static 변수, 정적 변수, 클래스 변수
    // static이 붙은 멤버 변수는 인스턴스 영역이 아닌 메서드 영역에서 관리함
    // 인스턴스와는 다르게 여러 곳에서 공유하는 목적으로 사용됨.

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
