package ref;

import java.sql.SQLOutput;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null; // 참조형 변수 data를 만들어 null값 할당 -> 가리키는 객체 X
        System.out.println("1. data = " + data);

        data = new Data(); // 새로운 data 객체 생성하여 참조값을 data 변수에 할당
        System.out.println("2. data = " + data);

        data = null; // data에 다시 null값 할당. 앞서 만든 Data 인스턴스를 더는 참조하지 않음
        System.out.println("3. data = " + data);
    }
}
