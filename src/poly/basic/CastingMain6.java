package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        Call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        Call(parent2);
    }

    private static void Call(Parent parent) {
        parent.parentMethod();

        // Child 인스턴스인 경우 ChildMethod() 실행
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            // Child child = (Child) parent; 이거 필요 없음 위에서 Child child 해놨으니까 이미 다운캐스팅을 한거임
            child.childMethod();
        }
    }
}
