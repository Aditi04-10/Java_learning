package four;
/* Collection : Group of objects
Collection Framework is a toolbox for managing group of objects
>List
>Queue
>Map
>Set

Array : Fixed size, Same datatype, Lacks ready made methods for common operations
Collection : Dynamic size, Heterogenous datatype, Comes with ready made methods for common operations

List : Ordered, Allow duplicates
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class car{
    String brand;

    car(String brand){
        this.brand = brand;
    }
}

public class ListDemo {
    static void main() {
//        List users = new ArrayList<>();
//        users.add("Alice");
//        users.add("Bob");
//        users.add("Charlie");
//        users.add(1); //You can add any type of datatype beacause there in no typesafety

        List<String> users = new ArrayList<>(); // This is for typesafety
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("Alice"); //Also we can add multiple elements

        System.out.println("All users");
        for(Object u1 : users){    // Created Object here
            System.out.println(u1);
        }
        System.out.println("Elements using index : "+ users.get(1));

        //List of Objects
        car c1 = new car("Toyota");
        car c2 = new car("Ford");

        List<car> carList = new ArrayList<>();
        carList.add(c1);
        carList.add(c2);

        for(car obj : carList){
            System.out.println(obj.brand);
        }

    }
}
