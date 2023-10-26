package lesson6_hw.task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("2980597", "Samsung", 150.5f);
        Phone phone2 = new Phone("3393597", "Apple", 130.5f);
        Phone phone3 = new Phone("2980597", "Google", 120.5f);

        System.out.println(phone1.getModel() + ", weight: " + phone1.getWeight() + ", phone number: " + phone1.getNumber());
        System.out.println(phone2.getModel() + ", weight: " + phone1.getModel() + ", phone number: " + phone2.getModel());
        System.out.println(phone3.getModel() + ", weight: " + phone1.getModel() + ", phone number: " + phone3.getModel());
        phone1.receiveCall("Витя");
        phone1.receiveCall("Борис");
        phone1.receiveCall("Елена");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();
        phone1.receiveCall("Жанна", "33576590");
        phone2.sendMessage("294647474", "331098209");
    }
}
