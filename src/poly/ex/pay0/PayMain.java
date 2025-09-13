package poly.ex.pay0;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // 잘못된 결제
        String payOption2 = "bad";
        int amount2 = 5000;
        payService.processPay(payOption2, amount2);
    }
}
