package ref.ex;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int order = scanner.nextInt();
        scanner.nextLine();

        // 배열 생성 (배열만 만들어서 배열 안에 ProductOrder 객체가 실제로 생성된게 아님.)
        // 즉 배열의 칸만 확보됨. order[0], order[1] 이런 참조 변수가 생기긴 했지만 안에는 Null만 있음
        ProductOrder[] orders = new ProductOrder[order];

        makeOrder(orders, scanner);
        printOrders(orders);
        getTotalAmount(orders);
    }

    static void makeOrder(ProductOrder[] orders, Scanner scanner) { // 주문 정보 입력


        for(int i = 0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            // orders[i] 사용 전 객체를 직접 생성해야함.
            orders[i] = new ProductOrder();

            System.out.print("상품명 : ");
            String name = scanner.nextLine();
            orders[i].productName = name;

            System.out.print("가격 : ");
            int price = scanner.nextInt();
            orders[i].price = price;

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드
            orders[i].quantity = quantity;
        }


    }


    static void printOrders(ProductOrder[] orders) {
        for(int i = 0; i <orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + " 가격 : " + orders[i].price + " 주문 수량 : " + orders[i].quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for(int i = 0; i <orders.length; i++) {
            totalAmount += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}