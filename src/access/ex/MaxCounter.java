package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= max) {
            System.out.println("최대입니다.");
            return;
        }

        this.count++;

    }

    public void getCount() {
        System.out.println("현재 값은 : " + count + "입니다.");
    }
}
