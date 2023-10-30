package lesson7_HW.task1;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private double ha;

    public Triangle(double a, double b, double c, double ha) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ha = ha;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getHa() {
        return ha;
    }

    public void setHa(double ha) {
        this.ha = ha;
    }

    @Override
    public double square() {
        return 1 / 2 * this.a * this.ha;
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
