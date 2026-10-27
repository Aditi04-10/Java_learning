package Polymorphism;

public class car_Poly extends Vehicle_Poly{
    private int doors;


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Override in child class " + "Brand: " + getBrand() + " Speed: " + getSpeed() + " Doors: " + doors);

    }

    @Override
    public void start() {
        System.out.println("Starting Car...");
    }

    public car_Poly(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;


    }
}
