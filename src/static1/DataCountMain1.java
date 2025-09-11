package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("A count = " + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("A count = " + data1.count);

        // 각자 하나씩 메모리를 새로 할당하기 때문에 이런식으로 count를 늘릴 수 없음
        // 이 문제를 해결하기 위해선 변수를 서로 관리 해야함
    }
}
