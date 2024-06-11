package TT.B2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","black");
        Car car2 = new Car("Ford","white");
        // truy cap cac phuong thuc cua lop cha nhu get/set
        System.out.println("Car 1's brand: " + car1.getBrand());
        car1.setColor("yellow"); //doi mau
        //hien thi thong tin cua xe oto
        System.out.println(car1);
        System.out.println(car2);
        Motorcycle motorcycle1 = new Motorcycle("Honda","red-white");
        Motorcycle motorcycle2 = new Motorcycle("Vinfast","blue");
        // hien thi thong tin
        System.out.println(motorcycle1);
        System.out.println(motorcycle2);
    }
}
