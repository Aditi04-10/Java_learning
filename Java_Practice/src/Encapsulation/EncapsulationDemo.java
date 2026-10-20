package Encapsulation;

class car {
    private String brand; // we can hide these from outside world
    private String color;
    private int speed;


    public car(String brand, String color, int speed ){
        System.out.println("Constructor called");
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}

public class EncapsulationDemo {
    static void main() {
        car c1 = new car("Mercedes", "Black", 450);

        car c2 = new car("BMW", "White", 500);

    }
}
