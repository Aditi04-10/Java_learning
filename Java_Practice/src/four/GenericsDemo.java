package four;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class carNew{
    String brand;

    carNew(String brand){
        this.brand = brand;
    }
}

public class GenericsDemo {
    static void main() {
        List users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add(1); //You can add any type of datatype beacause there in no typesafety //This is called ## Generics ##

//        List<String> users = new ArrayList<>(); // This is for typesafety
//        users.add("Alice");
//        users.add("Bob");
//        users.add("Charlie");
//        users.add("Alice"); //Also we can add multiple elements

        System.out.println("All users");
        for(Object u1 : users){    // Created Object here
            System.out.println(u1);
        }
        System.out.println("Elements using index : "+ users.get(1));

        //List of Objects
        carNew c1 = new carNew("Toyota");
        carNew c2 = new carNew("Ford");

        List<carNew> carList = new ArrayList<>();
        carList.add(c1);
        carList.add(c2);

        for(carNew obj : carList){
            System.out.println(obj.brand);
        }

    }
}
