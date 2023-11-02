package lesson7_HW.practice;

public class Student extends UniversityPeople {
    private String groupNumber;
    private Hostel hostel;
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Student(String name, String surname, String groupNumber, Hostel hostel) {
        super(name, surname);
        this.groupNumber = groupNumber;
        this.hostel = hostel;
    }

    public Student(String name, String surname, String groupNumber) {
        super(name, surname);
        this.groupNumber = groupNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }


    @Override
    public String toString() {
        return name + " " + surname + ", группа № " + groupNumber;
    }
}
