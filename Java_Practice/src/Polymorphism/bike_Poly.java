package Polymorphism;

public class bike_Poly extends Vehicle_Poly{
    private boolean hasCarrier;

    public bike_Poly(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier=hasCarrier;
    }
}
