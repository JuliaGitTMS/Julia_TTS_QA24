package lesson6_hw.TaskAdd1;

public class Dentist implements Doctor{
    @Override
    public void heal() {
        System.out.println("Дантист лечит");
    }
}
