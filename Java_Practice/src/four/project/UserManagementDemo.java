package four.project;

import java.util.*;

public class UserManagementDemo {
    static void main() {
//        Set<String> user1roles = new HashSet<>(Arrays.asList("ADMIN", "USER"));
//        User user1 = new User("Alice", true, user1roles);

        List<User> users = new ArrayList<>();
        users.add(new User("Alice", true, new HashSet<>(Arrays.asList("ADMIN", "USER"))));

        List<User> users = new ArrayList<>();
        users.add(new User("Bob", false, new HashSet<>(Arrays.asList("USER"))));

        List<User> users = new ArrayList<>();
        users.add(new User("Charlie", true, new HashSet<>(Arrays.asList("MANAGER"))));

    }
}
