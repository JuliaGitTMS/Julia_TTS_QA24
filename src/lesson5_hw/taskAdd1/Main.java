package lesson5_hw.taskAdd1;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2000, "HP");
        comp1.displayInfo();
        RAM ram1 = new RAM("DDR4", 16);
        HDD hdd1 = new HDD("Seagate", 2, "SATA 3.0");
        Computer comp2 = new Computer(1500, "Lenovo", hdd1, ram1);
        comp2.displayInfo();
    }
}
