package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; // this라는게 이 클래스의 name을 사용하겠다는겨 내 인스턴스를 가리키는겨
        this.age = age;
        this.grade = grade;
    }
}
