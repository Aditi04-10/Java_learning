package ClassesobejectDemo;

public class car5 {
    String brand;
    String color;
    int speed;

    // this refers to the current class fields
    public car5(String brand, String color, int speed ){    //I'll make my constructor parameterised
        System.out.println("Constructor called");
        this.brand = brand; //this.brand refers to the above intialised brand
        this.color = color; //this.color refers to the above intialised color
        this.speed = speed; //this.speed refers to the above intialised speed
    }

    public int getSpeed() {   //This is a getter
//        if(speed<0){  // We can also write logic here
//            return 0;
//        }
        return speed;  //It will return the value of that instance who have called it
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}
