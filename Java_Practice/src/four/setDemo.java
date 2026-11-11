package four;
// Set : Unordered and it does not allow duplicates

import java.util.HashSet;
import java.util.Set;

public class setDemo {
    static void main() {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGER");

        for(String r : roles){
            System.out.println(r);
        }
    }
}
