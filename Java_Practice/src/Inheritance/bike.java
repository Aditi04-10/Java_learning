package Inheritance;

public class bike extends Vehicle{
    private boolean hasCarrier;

    public bike(String brand, int speed, boolean hasCarrier) {      // brand & speed it is taking from parent class & hasCarrier from itself
        super(brand, speed);
        this.hasCarrier=hasCarrier;
    }
}
