package four.project;

import java.util.Set;

public class User {
    private String name;
    private boolean active;
    private Set<String> roles;

    public User(String name, boolean active, Set<String> roles) {
        this.name = name;
        this.roles = roles;
        this.active = active;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }
}
