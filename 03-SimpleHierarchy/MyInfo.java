class Vehicle {
    // property
    String brand;

    // method start()
    public void start() {
        System.out.println(brand + " กำลังสตาร์ท...");
    }
}

class Car extends Vehicle {
    // method drive()
    public void drive() {
        System.out.println(brand + " กำลังขับเคลื่อนบนถนน");
    }
}

public class MyInfo  {
    public static void main(String[] args) {
        // สร้าง object ของ Car
        Car myCar = new Car();
        myCar.brand = "Toyota";  // กำหนดค่า brand

        // เรียก method
        myCar.start();
        myCar.drive();
    }
}


