
interface Playable {
    void play();
}

// สร้าง abstract class ชื่อ MusicDevice
abstract class MusicDevice {
    String brand;

    // Constructor
    MusicDevice(String brand) {
        this.brand = brand;
    }

    // Method ปกติ
    void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }

    // Abstract method
    abstract void connect();
}

// สร้าง class ชื่อ CDPlayer
class CDPlayer extends MusicDevice implements Playable {

    CDPlayer(String brand) {
        super(brand);
    }

    @Override
    void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }

    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

// สร้าง class ชื่อ Smartphone
class Smartphone extends MusicDevice implements Playable {

    Smartphone(String brand) {
        super(brand);
    }

    @Override
    void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }

    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

// main class
public class Main{
    public static void main(String[] args) {
        // สร้าง object CDPlayer
        CDPlayer cdPlayer = new CDPlayer("Sony");
        cdPlayer.connect();
        cdPlayer.info();
        cdPlayer.play();

        System.out.println(); // เว้นบรรทัด

        // สร้าง object Smartphone
        Smartphone smartphone = new Smartphone("Samsung");
        smartphone.connect();
        smartphone.info();
        smartphone.play();
    }
}
