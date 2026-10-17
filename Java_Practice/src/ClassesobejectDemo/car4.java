package ClassesobejectDemo;

public class car4 {
    String brand;
    String color;
    int speed;

    // this refers to the current class
    public car4(String brand, String color, int speed ){    //I'll make my constructor parameterised
        System.out.println("Constructor called");
        this.brand = brand; //this.brand refers to the above intialised brand
        this.color = color; //this.color refers to the above intialised color
        this.speed = speed; //this.speed refers to the above intialised speed
    }
    void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}
