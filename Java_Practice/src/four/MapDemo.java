package four;
// Map : It stores in the form of key and value
//Ex: firstname:"John"
//    (key)      (Value)
//Map cannot contains duplicate keys

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    static void main() {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1,"Alice");
        userMap.put(2,"Bob");
        userMap.put(3,"Charlie");

        System.out.println(userMap.get(2));
        for (Map.Entry<Integer,String> entry : userMap.entrySet()){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
}
