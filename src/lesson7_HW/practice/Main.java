package lesson7_HW.practice;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room room11 = new Room(1, 1);
        Room room12 = new Room(2, 2);
        Room room13 = new Room(3, 2);
        Room room14 = new Room(4, 3);
        Room room15 = new Room(5, 2);

        Hostel hostel1 = new Hostel("пр. Независимости, 48/1", "Студенческое общежитие №1",
                new Room[]{room11, room12, room13, room14, room15});

        Room room21 = new Room(1, 3);
        Room room22 = new Room(2, 2);
        Room room23 = new Room(3, 2);
        Room room24 = new Room(4, 3);
        Room room25 = new Room(5, 4);

        Hostel hostel2 = new Hostel("пр. Независимости, 48/2", "Студенческое общежитие №2",
                new Room[]{room21, room22, room23, room24, room25});

        University univerBNTU = new University("БНТУ");
        univerBNTU.setHostels(new Hostel[]{hostel1, hostel2});
        Student[] students = new Student[100];
        univerBNTU.setStudents(students);
        Employee[] employees = new Employee[100];
        univerBNTU.setEmployees(employees);
        System.out.println("Приветствуем Вас в университете " + univerBNTU.getName() +
                "\nГлавное меню:\n1. Добавить студента\n2. Добавить сотрудника\n3. Заселить студента в общежитие\n" +
                "4. Просмотр всех студентов\n5. Просмотр всех сотрудников\n6. Выход\nВыберите действие:");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            switch (i) {
                case 1: {
                    univerBNTU.addStudent();
                    break;
                }
                case 2: {
                    univerBNTU.addEmployee();
                    break;
                }
                case 3: {
                    univerBNTU.hostelCheckIn();
                    break;
                }
                case 4: {
                    univerBNTU.showStudents();
                    break;
                }
                case 5: {
                    univerBNTU.showEmployees();
                    break;
                }
                case 6: {
                    System.exit(0);
                }
            }

        }
    }
}
