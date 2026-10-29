package Polymorphism;

import Inheritance.Vehicle;
import Inheritance.bike;
import Inheritance.car;

public class Polymorphism_demo {      //Polymorphism means the ability of an object to take multiple forms
    static void main() {             // Two types are: Compile time  &  Runtime
        car_Poly c1 = new car_Poly("Toyota", 200, 4);
        c1.displayInfo();

        bike_Poly b1 = new bike_Poly("R15", 150, true);
        b1.displayInfo();
        c1.start(); //Accessing the override method "start()" in car_Poly class
        b1.start();  //Same here

        Vehicle_Poly v1 = new Vehicle_Poly("Vehicle_Brand",202);
        v1.start();

        // Runtime Polymorphism (Method Overriding)
        Vehicle_Poly v2 = new car_Poly("Ford",250,6); // we can make a parent class object &
        v2.start();                                                      // can instantiate it with child class with the help of new operator
                                                                        // This is also called Runtime Polymorphism (Method Overriding) because it happens during runtime
        Vehicle_Poly v3 = new bike_Poly("BMW_bike",400,true);
        v3.start();

        //This is Method Overloading
        b1.start("Hello");
    }

}
