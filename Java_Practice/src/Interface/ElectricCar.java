package Interface;

public class ElectricCar implements CarControls{      //we don't inherit interface class, we implements it
    // Here you'll give implementations of the functions declared in the class CarControls, because we are using its methods without definition

    @Override
    public void turnRight() {
        System.out.println("Electric Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Left");
    }

    @Override
    public void ApplyBrakes() {
        System.out.println("Electric Brakes");
    }
}
