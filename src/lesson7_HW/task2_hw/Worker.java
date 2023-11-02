package lesson7_HW.task2_hw;

public class Worker implements Employee {
    private String post;

    public Worker() {
        post = "Рабочий";
    }

    @Override
    public void printPost() {
        System.out.println(this.post);
    }
}
