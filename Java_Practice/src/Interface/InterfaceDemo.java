package Interface;

public class InterfaceDemo {
    static void main() {
        ElectricCar e1 = new ElectricCar();
        e1.ApplyBrakes();
        e1.turnRight();
        e1.turnLeft();

        CarControls mycar1 = new ElectricCar();
        mycar1.turnLeft();

        CarControls mycar2 = new SportsCar();
        mycar2.turnLeft();
    }
}
