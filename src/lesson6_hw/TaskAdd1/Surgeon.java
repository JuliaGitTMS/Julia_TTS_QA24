package lesson6_hw.TaskAdd1;

public class Surgeon implements Doctor {
    @Override
    public void heal() {
        System.out.println("Хирург лечит");
    }
}
