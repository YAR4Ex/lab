public class Rectangle implements Figure {
    private double a = 0;
    private double b =0;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
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
}
