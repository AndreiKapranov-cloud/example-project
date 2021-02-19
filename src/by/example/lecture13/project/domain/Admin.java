package by.example.lecture13.project.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Admin extends User implements Serializable {

    private static final long serialVersionUID = 1L;
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

    @Override
    public String toString() {
        return "Admin{" +
                "permissions=" + permissions +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", logged=" + logged +
                '}';
    }

}
