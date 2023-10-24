package lesson5_hw.taskAdd1;

public class HDD {
    String name;
    int volume;
    String type;

    public HDD() {
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Марка HDD: " + this.name);
        System.out.println("Объем памяти HDD: " + this.volume + " ТБ");
        System.out.println("Тип жесткого диска: " + this.type);
    }
}
