package lesson5_hw.task1;

public class CreditCard {
    String accountNumber;
    float currentAmount;

    public CreditCard() {
    }

    public CreditCard(String accountNumber, float currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void deposit(float depositAmount) {
        currentAmount += depositAmount;
    }

    public void withdraw(float withdrawAmount) {
        currentAmount -= withdrawAmount;
    }

    public void cardInfo() {
        System.out.println("Номер счета: " + this.accountNumber);
        System.out.println("Текущая сумма на счету: " + this.currentAmount);
        System.out.println("-----------------------");
    }
}
