package ClassesobejectDemo;

public class Demo4 {
    static void main() {
        car4 c4 = new car4("Mercedes", "Black", 450);
        /*Directly gave values here instead of giving one by one  */

//    c2.brand = "Mercedes";
//    c2.color = "Black";
//    c2.speed = 450;
        c4.drive();

        car4 c5 = new car4("BMW", "White", 500);
        c5.drive();


    }
}

