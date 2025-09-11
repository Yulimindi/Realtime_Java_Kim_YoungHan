package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] student = new String[]{"학생 1", "학생 2"};
        String[] age = new String[]{"17", "18"};
        String[] grade = new String[]{"80", "90"};

        for(int i = 0; i < student.length; i++) {
            System.out.println("이름 : " + student[i] + " 나이 : " + age[i] + " 성적 : " + grade[i]);
        }

    }
}
