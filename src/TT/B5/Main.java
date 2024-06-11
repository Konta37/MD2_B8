package TT.B5;

public class Main {
    public static void main(String[] args) {
        //Truy cập thuộc tính, phương thức không cần khởi tạo đối tượng
        System.out.println("Tên: " + StaticMethod.name);
        System.out.println("Tuổi: " + StaticMethod.age);

        StaticMethod.showInfor();
        //Khởi tạo đối tượng
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("tên: " + staticMethod.name);
        System.out.println("tuổi: " + staticMethod.age);
        staticMethod.showInfor();
    }
}
