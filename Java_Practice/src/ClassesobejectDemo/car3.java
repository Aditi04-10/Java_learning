package ClassesobejectDemo;

public class car3 {
    String brand;
    String color;
    int speed;


    public car3(String b, String c, int s ){    //I'll make my constructor parameterised
        System.out.println("Constructor called");
        brand = b; //brand refers to the above intialised brand
        color = c; //color refers to the above intialised color
        speed = s; //speed refers to the above intialised speed
    }
    void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}
