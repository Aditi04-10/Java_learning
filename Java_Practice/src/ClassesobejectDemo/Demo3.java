package ClassesobejectDemo;

public class Demo3 {
    static void main() {
        car3 c2 = new car3("Mercedes", "Black", 450);
        /*Directly gave values here instead of giving one by one  */

//    c2.brand = "Mercedes";
//    c2.color = "Black";
//    c2.speed = 450;
        c2.drive();

        car3 c3 = new car3("BMW", "White", 500);
        c3.drive();


    }
}
