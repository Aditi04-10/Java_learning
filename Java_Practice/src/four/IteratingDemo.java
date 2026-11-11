package four;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    static void main() {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("John");

        //List<User> userList = getFromDatabae();  // In future, we can access the list from database through this syntax.

        //For traversing the data (means access data one by one)
        // Using forEach loop (Enhanced For loop)
        System.out.println(" USING FOR EACH");
        for(String user : users){
            System.out.println(user);
        }

        //Using for loop
        System.out.println("USING FOR LOOP");
        for(int i =0;i<users.size();i++){
            System.out.println(users.get(i));
        }

        //Using Iterator
        System.out.println("USING ITERATOR");
        Iterator<String> it = users.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());
            if(it.next().equals("Bob")){
                it.remove();
            }
        }
        for(String user : users){
            System.out.println(user);
        }
    }
}
