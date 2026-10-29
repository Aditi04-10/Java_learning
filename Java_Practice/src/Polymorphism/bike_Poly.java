package Polymorphism;

public class bike_Poly extends Vehicle_Poly{
    private boolean hasCarrier;

    @Override
    public void start() {
        System.out.println("Starting Bike...");
    }

    public void start(String greet) {    //Method Overloading
        System.out.println("Starting Bike..."+ greet);
    }

    public bike_Poly(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier=hasCarrier;

    }
}
