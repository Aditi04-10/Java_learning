package Inheritance;

public class car extends Vehicle{
    private int doors;


    @Override
    public void displayInfo() { // This is method overriding. If we want method of same name as parent class method, so we override the method
        super.displayInfo(); // This is a method of Parent class i.e, Vehicle class
        System.out.println("Override in child class " + "Brand: " + getBrand() + " Speed: " + getSpeed() + " Doors: " + doors); //Here, we can display anything for child class
        // we access brand from getBrand() because fields are private. And we are doing encapsulation here
    }

    public car(String brand, int speed, int doors) {
        super(brand, speed); // Super is calling vehicle class's constructor. It provides values to the parent class.
          // If our fields of the parent class will be private then we can't give them values by writing "this.brand", so that's why we use super.
        this.doors = doors;


    }
}

