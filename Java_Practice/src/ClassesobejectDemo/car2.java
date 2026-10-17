package ClassesobejectDemo;

public class car2 {
    String brand;
    String color;
    int speed;


    public car2(){
        System.out.println("Constructor called");
        brand = "BMW";
        color = "Blue";
        speed = 500;
    }
    void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}
