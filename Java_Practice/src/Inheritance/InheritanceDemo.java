package Inheritance;

public class InheritanceDemo {
    static void main() {
        car c1 = new car("Toyota", 200, 4);
        c1.displayInfo();

        bike b1 = new bike("R15", 150, true);
        b1.displayInfo();
    }
}
