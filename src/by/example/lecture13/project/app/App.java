package by.example.lecture13.project.app;

import by.example.lecture13.project.db.DB;
import by.example.lecture13.project.domain.Admin;
import by.example.lecture13.project.domain.Member;

public class App {

    public static void main(String[] args) {

        Admin admin = new Admin("admin", "admin");
        Member member = new Member("member", "member", null);

        DB.addUser(member);
        DB.addUser(admin);

        DB.print();

        DB.sort();
        DB.print();

        DB.deleteUser("admin");
        DB.print();

    }

}
