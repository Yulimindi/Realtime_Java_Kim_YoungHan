package access.a;

import javax.swing.*;

public class PublicClass {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 Class2 = new DefaultClass2();
    }
}

    class DefaultClass1 { // default 접근제어자, 같은 패키지 내에서만 접근 가능

    }

    class DefaultClass2 {

    }

