package by.example.lecture13.project.db;

import by.example.lecture13.project.domain.User;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class DB {

    private static List<User> users = new LinkedList<>();

    private DB() {
    }

    public static void addUser(User user) {
        boolean userExists = users.stream()
                .anyMatch(userInDb -> userInDb.getLogin().equals(user.getLogin()));
        if (!userExists) {
            users.add(user);
        }
    }

    public static void deleteUser(String login) {
        users.stream()
                .filter(user -> user.getLogin().equals(login))
                .findFirst()
                .ifPresent(users::remove);
    }

    public static void print() {
        System.out.println("--------------------------DB--------------------------");
        users.forEach(System.out::println);
        System.out.println("------------------------------------------------------");
    }

    public static void sort() {
        Collections.sort(users);
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        DB.users = users;
    }

}
