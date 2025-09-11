package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user1", 16, 80);

        MemberInit[] members = {member1, member2};

        // iter 사용하면 바로 for문 만들어져용
        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade);
        }
    }

}
