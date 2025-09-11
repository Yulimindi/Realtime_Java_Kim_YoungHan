package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3]; // 배열 생성

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        getTotalAmount(orders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) { // 새 오더 생성
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for(int i = 0; i <orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + " 가격 : " + orders[i].price + " 주문 수량 : " + orders[i].quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for(int i = 0; i <orders.length; i++) {
            totalAmount += orders[i].price;
        }
        System.out.println("총 결제 금액 : " + totalAmount);
    }
}