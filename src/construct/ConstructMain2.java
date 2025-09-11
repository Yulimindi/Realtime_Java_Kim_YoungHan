package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // 메모리 만들고 생성자 호출해서 객체 만드는 것까지 한번에
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);

        }
    }
}
