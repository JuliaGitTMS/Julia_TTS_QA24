package lesson7_HW.task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(5), new Rectangle(23, 4),
                new Triangle(5, 12, 13, 5), new Circle(7), new Rectangle(12, 7)};
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].perimeter();
        }
        System.out.println("Сумма периметров всех фигур= " + sum);
    }
}
