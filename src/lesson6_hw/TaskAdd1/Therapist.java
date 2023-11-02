package lesson6_hw.TaskAdd1;

public class Therapist implements Doctor {
    @Override
    public void heal() {
        System.out.println("Терапевт лечит");
    }
}
