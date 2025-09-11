package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // data라는 참조형을 final로 선언함
        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        // 정리하면 참조형 변수에 final이 붙으면 참조 대상 자체를 다른 대상으로 변경하지 못하는 것이지 참조하는 대상의 값은 변경할 수 있다
    }
}
