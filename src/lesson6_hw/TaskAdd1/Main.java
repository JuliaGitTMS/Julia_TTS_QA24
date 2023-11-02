package lesson6_hw.TaskAdd1;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Tom", new Treatment(1));
        Patient patient2 = new Patient("Bob", new Treatment(2));
        Patient patient3 = new Patient("Jack", new Treatment(5));
        patient1.doctorAppoint();
        patient2.doctorAppoint();
        patient3.doctorAppoint();
    }
}
