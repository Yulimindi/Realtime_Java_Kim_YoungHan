package construct;

public class MemberThis {
    String nameField;

    void initMembers(String nameParameter) {
        nameField = nameParameter; // nameField 앞에 this. 생략되어있음
    }
}
