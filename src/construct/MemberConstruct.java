package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) { // 생성자가 2개! 생성자 오버로딩
        this(name, age, 50);// 코드 간략하게 이렇게 해서 이거 그대로 아래 생성자에 넘겨주면 코드는 간략화되고 잘 돌아가용
        // this를 사용하여 생성자 내부에서 다른 생성자를 호출하는 것
        // 하지만 this는 생성자 코드의 첫줄에만 작성할 수 있음!
    }

    // 생성자 : 생성자 이름은 클래스 이름과 같아야 함. 생성자는 반환 타입이 없으며 비워둬야 함. 나머지는 메서드와 같음.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
