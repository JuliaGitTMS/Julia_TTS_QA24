package lesson10_hw.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Виктор Б", "23485", 1, new int[]{3, 2, 4, 6, 7});
        Student student2 = new Student("Борис Х", "243585", 1, new int[]{1, 2, 1, 1, 1});
        Student student3 = new Student("Лиза Р", "23465", 1, new int[]{8, 7, 5, 6, 9});

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        printStudents(studentList, 1);
        System.out.println("______________________");
        upgradeStudents(studentList);
        printStudents(studentList, 2);
    }

    public static void upgradeStudents(List<Student> students) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            int sumMark = 0;
            Student s = studentIterator.next();
            for (int i : s.marks) {
                sumMark += i;
            }
            if (sumMark / (s.marks.length - 1) < 3) {
                studentIterator.remove();
            } else s.setCourse(s.getCourse() + 1);
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }
}
