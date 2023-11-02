package lesson7_HW.practice;

public enum Position {

    DEAN("Декан"),
    RECTOR("Ректор"),
    PROFESSOR("Преподаватель"),
    ASSISTANT("Лаборант"),
    CLEANER("Уборщик");

    String name;

    Position(String name) {
        this.name = name;
    }
}
