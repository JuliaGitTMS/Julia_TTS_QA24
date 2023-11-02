package lesson7_HW.practice;

public class Employee extends UniversityPeople {
    private Position position;

    public Employee(String name, String surname, Position position) {
        super(name, surname);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return name + " " + surname + ": " + position.name;
    }
}
