package Encapsulation;

class car {
    private String brand; // we can hide these from outside world
    private String color;  //we can access details only through getters & setters
    private int speed;


    public car(String brand, String color, int speed ){
        this.brand = brand;
        this.color = color;
        //this.speed = speed;
        setSpeed(speed);
        // We can also set the speed from the constructor so that
        // we can do validations from here only, otherwise it is giving the value that is given at the time of object calling
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) { // by removing setter nobody can change the details
        if(speed<0){      // We can do validations here or can write logic which we have to provide
            speed = 0;
        }
        this.speed = speed; // Nobody can set the values
    }

    void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}

public class EncapsulationDemo {
    static void main() {
        car c1 = new car("Mercedes", "Black", 450);
        c1.setSpeed(-200);
        c1.drive();
        car c2 = new car("BMW", "White", -500);
        c2.drive();

    }
}
