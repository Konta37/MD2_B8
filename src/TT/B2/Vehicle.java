package TT.B2;

public class Vehicle {
    private String brand;
    private String color;
    public Vehicle(){}
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public String getColor() {
        return color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Vehicle{" +
                "brand= " + brand + '\'' +
                ",color= " + color + '\'' +"}";
    }
}
