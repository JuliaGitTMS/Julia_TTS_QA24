package lesson7_HW.practice;

public class Room {
    private int number;
    private int freeCapacity;

    public Room(int number, int capacity) {
        this.number = number;
        this.freeCapacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFreeCapacity() {
        return freeCapacity;
    }

    public void setFreeCapacity(int freeCapacity) {
        this.freeCapacity = freeCapacity;
    }
}
