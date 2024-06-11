package TT.B2;

public class Car extends Vehicle {
    public Car() {}
    public Car(String brand, String color){
        super(brand, color);
    }

    public String toString(){
        return "Vehicle{" +
                "brand= " + this.getBrand() + '\'' +
                ",color= " + this.getColor() + '\'' +"}";
    }
}
