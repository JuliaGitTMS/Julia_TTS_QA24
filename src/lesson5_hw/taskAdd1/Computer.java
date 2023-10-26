package lesson5_hw.taskAdd1;

import java.util.HashSet;

public class Computer {
    float price;
    String model;
    HDD hdd;
    RAM ram;

    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
        hdd = new HDD();
        ram = new RAM();
    }

    public Computer(float price, String model, HDD hdd, RAM ram) {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void displayInfo() {
        System.out.println("Модель компьютера: " + this.model);
        System.out.println("Цена: " + this.price);
        hdd.displayInfo();
        ram.displayInfo();
        System.out.println("-------------------");
    }
}
