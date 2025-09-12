package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 단, 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 다운 캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly; // poly에 있는 참조값을 child에 넣음
        child.childMethod();

        // 일시적 다운 캐스팅 - 해당 메서드 호출 순간만 다운캐스팅
        ((Child) poly).childMethod(); // 연산 우선순위가 .childMethod()가 먼저기 때문에 괄호 이용하기
    }
}
