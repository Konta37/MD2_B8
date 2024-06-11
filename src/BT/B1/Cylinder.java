package BT.B1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){}

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getheight() {
        return height;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public double calVolume(){
        return super.getArea() * height;
    }
}
