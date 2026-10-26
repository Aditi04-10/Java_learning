package Polymorphism;

import Inheritance.bike;
import Inheritance.car;

public class Polymorphism_demo {      //Polymorphism means the ability of an object to take multiple forms
    static void main() {             // Two types are: Compile time  &  Runtime
        car_Poly c1 = new car_Poly("Toyota", 200, 4);
        c1.displayInfo();

        bike_Poly b1 = new bike_Poly("R15", 150, true);
        b1.displayInfo();
        c1.start(); //Accessing from parent class Vehicle
        b1.start();  //Same here
    }
}
