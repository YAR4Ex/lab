public class Circle implements Figure {
    private double radius = 0;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){return 2*Math.PI*radius;}
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}