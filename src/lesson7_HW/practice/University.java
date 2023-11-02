package lesson7_HW.practice;

import java.util.Scanner;

public class University {
    private String name;
    private Employee[] employees;
    private Student[] students;
    private Hostel[] hostels;

    public University(Employee[] employees, Student[] students, Hostel[] hostels) {
        this.employees = employees;
        this.students = students;
        this.hostels = hostels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Hostel[] getHostels() {
        return hostels;
    }

    public void setHostels(Hostel[] hostels) {
        this.hostels = hostels;
    }

    public University(String name) {
        this.name = name;
    }

    int countStudents = 0;
    int countEmployees = 0;

    public void addStudent() {
        System.out.println("Введите имя студента");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите фамилию студента");
//        scanner.next();
        String surname = scanner.nextLine();
        System.out.println("Введите номер группы");
//        scanner.next();
        String group = scanner.nextLine();
        Student student = new Student(name, surname, group);
        students[countStudents] = student;
        countStudents += 1;
        System.out.println("Студент успешно внесен в базу\n-------------------\nВыберите следующий шаг:");
    }

    public void addEmployee() {
        System.out.println("Введите имя сотрудника");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите фамилию сотрудника");
        String surname = scanner.nextLine();
        System.out.println("Выберите должность\n1. Декан\n2. Ректор\n3. Преподаватель\n4. Лаборант\n5. Уборщик");
        Position position = null;
        switch (scanner.nextInt()) {
            case 1:
                position = Position.DEAN;
                break;
            case 2:
                position = Position.RECTOR;
                break;
            case 3:
                position = Position.PROFESSOR;
                break;
            case 4:
                position = Position.ASSISTANT;
                break;
            case 5:
                position = Position.CLEANER;
                break;
        }
        Employee employee = new Employee(name, surname, position);
        employees[countEmployees] = employee;
        countEmployees += 1;
        System.out.println("Сотрудник успешно внесен в базу\n-------------------\nВыберите следующий шаг:");
    }

    public void showEmployees() {
        if (countEmployees == 0) {
            System.out.println("В университете нет сотрудников");
        } else {
            System.out.println("Сотрудники университета:");
            for (int i = 0; i < countEmployees; i++) {
                System.out.println(employees[i].toString());
            }
        }
        System.out.println("--------------------\nВыберите следующий шаг:");
    }

    public void showStudents() {
        if (countStudents == 0) {
            System.out.println("Зачисленных студентов нет");
        } else {
            System.out.println("Студенты университета:");
            for (int i = 0; i < countStudents; i++) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println("--------------------\nВыберите следующий шаг:");
    }

    public void hostelCheckIn() {
        if (students[0] == null) {
            System.out.println("Нет студентов для заселения\n-------------------\nВыберите следующий шаг:");
        } else {
            System.out.println("Введите фамилию студента");
            Scanner scanner = new Scanner(System.in);
            String tempSurname = scanner.nextLine();
            int count = 0;
            for (int k = 0; k < students.length; k++) {
                if (students[k] != null && tempSurname.equals(students[k].surname) &&
                        students[k].getHostel() == null) {
                    for (int i = 0; i < hostels.length; i++) {
                        for (int j = 0; j < hostels[i].getRooms().length; j++) {
                            if (hostels[i].getRooms()[j].getFreeCapacity() > 0) {
                                students[k].setHostel(hostels[i]);
                                students[k].setRoom((hostels[i].getRooms()[j]));
                                students[k].getRoom().setFreeCapacity(students[k].getRoom().getFreeCapacity() - 1);
                                i = hostels.length;
                                count = 1;
                                System.out.println("Студент успешно заселен в " + students[k].getHostel().getName() +
                                        ", в комнату № " + students[k].getRoom().getNumber() +
                                        "\n-------------------\nВыберите следующий шаг:");
                                break;
                            }
                        }
                    }
                }
            }
            if (count == 0) {
                System.out.println("Заселение невозможно по разным причинам (студент уже заселен, такого студента нет, нет мест)\n" +
                        "-----------------\nВыберите следующий шаг:");
            }
        }
    }
}
