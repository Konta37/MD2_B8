package TT.B2;

public class Motorcycle extends Vehicle {
    public Motorcycle() {}
    public Motorcycle(String brand, String color) {
        super(brand, color);
    }
    public String toString(){
        return "Vehicle{" +
                "brand= " + this.getBrand() + '\'' +
                ",color= " + this.getColor() + '\'' +"}";
    }
}
