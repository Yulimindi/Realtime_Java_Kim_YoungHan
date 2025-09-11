package oop1.ex;

public class Account {
    int balance; // 잔액

    int deposit(int amount) { // 입금 메서드
        balance += amount;
        System.out.println(amount + "원을 입금했습니다. 잔액 : " + balance);
        return balance;
    }

    int withdraw(int amount) { // 출금 메서드
        if(balance > amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 잔액 : " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다. 잔고 : " + balance);
        }
        return balance;
    }
}
