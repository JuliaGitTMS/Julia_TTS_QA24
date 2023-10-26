package lesson7_HW.practice;

public class Hostel {
    private String address;
    private String name;
    private Room [] rooms;

    public Hostel(String address, String name, Room [] rooms) {
        this.address = address;
        this.name = name;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
