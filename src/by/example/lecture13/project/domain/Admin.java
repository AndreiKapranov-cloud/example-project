package by.example.lecture13.project.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Admin extends User {

    private Set<Permission> permissions = new HashSet<>();

    public Admin(String login, String password) {
        super(login, password);
        permissions.add(Permission.READ);
        permissions.add(Permission.MODERATE);
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public void deletePermission(Permission permission) {
        permissions.remove(permission);
    }

}
