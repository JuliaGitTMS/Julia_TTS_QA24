package lesson5_hw.taskAdd1;

public class RAM {
    String name;
    int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void displayInfo() {
        System.out.println("RAM типа: " + this.name);
        System.out.println("Объем памяти: " + this.volume + " ГБ");
    }
}
