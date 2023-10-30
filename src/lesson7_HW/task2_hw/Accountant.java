package lesson7_HW.task2_hw;

public class Accountant implements Employee {
    private String post;

    public Accountant() {
        post = "Бухгалтер";
    }

    @Override
    public void printPost() {
        System.out.println(this.post);
    }
}
