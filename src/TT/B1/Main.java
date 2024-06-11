package TT.B1;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Pig");
        Dog dog1 = new Dog("Becgie","black");
        Dog dog2 = new Dog("Pug","white");
        Cat cat = new Cat("Dora");
        //get set
        System.out.println("animal1's name: "+animal1.getName());
        animal1.setName("Bird");
        System.out.println("animal1's name: "+animal1.getName());
        //truy cap phuong thuc ke thua tu lop cha
        dog1.setName("Corgi");
        System.out.println("dog1's name: "+dog1.getName());
        System.out.println("dog1's name: "+dog1.makeSound());
        System.out.println("dog2's color: "+dog2.getColor());
        System.out.println("dog2's sound: "+dog2.makeSound());
        System.out.println("cat's name: "+cat.getName());
        System.out.println("cat's sound: "+cat.makeSound());
    }
}
