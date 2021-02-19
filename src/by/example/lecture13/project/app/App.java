package by.example.lecture13.project.app;

import by.example.lecture13.project.db.DB;
import by.example.lecture13.project.domain.Admin;
import by.example.lecture13.project.domain.Member;
import by.example.lecture13.project.service.StorageService;
import by.example.lecture13.project.service.impl.DbStorageService;

public class App {

    private static final String FILENAME = "resources/db.txt";
    private static final StorageService storageService = new DbStorageService();

    public static void main(String[] args) {

        DB.setUsers(storageService.loadUsers());
        DB.print();

        // some logic
        Admin newAdmin = new Admin("new admin", "password");
        DB.addUser(newAdmin);


        DB.print();
        storageService.save(DB.getUsers());

    }

    private static void fillDb() {
        Admin admin = new Admin("admin", "admin");
        Member member = new Member("member", "member", null);

        DB.addUser(member);
        DB.addUser(admin);

        DB.sort();
        DB.print();
    }

}
