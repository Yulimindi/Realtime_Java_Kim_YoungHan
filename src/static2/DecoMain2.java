package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 객체 생성 없이 (new 어쩌구 할 필요 없이) 바로 Static 가서 부를 수 있음

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
