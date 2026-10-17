package ClassesobejectDemo;

public class Demo5 {
    static void main() {
        car5 c5 = new car5("Mercedes", "Black", 450);

        car5 c6 = new car5("BMW", "White", 500);

        System.out.println(c6.getSpeed()); //getting the value
        c6.setSpeed(600); // Setting the different value
        System.out.println(c6.getSpeed());
    }
}
