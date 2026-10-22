package Inheritance;

public class car extends Vehicle{
    private int doors;


      public car( String brand, int speed) {
        super(brand, speed); // Super is calling vehicle class's constructor. It provides values to the parent class.
          // If our fields of the parent class will be private then we can't give them values by writing "this.brand", so that's why we use super.
    }
}

