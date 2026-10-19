package ClassesobejectDemo;

    record Bike(String brand, int speed){} // Record gives constructor, getter & toString
public class Record {
    static void main() {
        Bike b1 = new Bike("Toyota", 250);
        System.out.println("Brand: " + b1.brand());
        System.out.println("Speed: " + b1.speed());
        System.out.println(b1); //toString method called
    }
}
