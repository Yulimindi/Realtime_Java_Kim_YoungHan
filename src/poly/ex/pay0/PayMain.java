package poly.ex.pay0;
import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("결제 수단을 입력하세요 : ");
            String howtopay = scanner.nextLine();

            if (howtopay.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요 : ");
            int amount = scanner.nextInt();

            scanner.nextLine();

            payService.processPay(howtopay, amount);
        }


    }
}
