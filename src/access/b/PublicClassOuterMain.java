package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

//        DefaultClass1 = class = new DefaultClass1(); 다른 패키지라서 컴파일 오류 남 뎡미니
    }
}
