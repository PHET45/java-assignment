class Car {
    // properties เป็น private
    private String brand;
    private int speed;

    // constructor (ไม่จำเป็น แต่เพิ่มเพื่อความสะดวก)
    public Car() {
        this.brand = "Unknown";
        this.speed = 0;
    }

    // setter สำหรับ brand
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    // setter สำหรับ speed
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    // getter สำหรับ brand
    public String getBrand() {
        return this.brand;
    }

    // getter สำหรับ speed
    public int getSpeed() {
        return this.speed;
    }

    // method เพิ่ม: displayInfo
    public void displayInfo() {
        System.out.println("Car brand: " + this.brand + ", Speed: " + this.speed + " km/h");
    }
}

class MyInfo {
    public static void main(String[] args) {
        // สร้าง object จาก class Car
        Car myCar = new Car();

        // ใช้ setter เพื่อกำหนดค่า
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);

        // เรียกใช้ displayInfo()
        myCar.displayInfo();

        // เพิ่มตัวอย่างทดสอบเพิ่มเติม (optional)
        Car another = new Car();
        another.setBrand("Honda");
        another.setSpeed(90);
        another.displayInfo();
    }
}

