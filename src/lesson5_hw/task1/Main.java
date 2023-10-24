package lesson5_hw.task1;

import lesson5_hw.task1.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("239562938", 23400.5f);
        CreditCard card2 = new CreditCard("32085208367", 1200.5f);
        CreditCard card3 = new CreditCard("3409673069", 5500.5f);
        card1.deposit(1300);
        card2.deposit(5);
        card3.withdraw(5);
        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}
