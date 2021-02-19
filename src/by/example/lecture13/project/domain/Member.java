package by.example.lecture13.project.domain;

import java.io.Serializable;

public class Member extends User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Admin curator;

    public Member(String login, String password, Admin curator) {
        super(login, password);
        this.curator = curator;
    }

    public Admin getCurator() {
        return curator;
    }

    public void setCurator(Admin curator) {
        this.curator = curator;
    }

    @Override
    public String toString() {
        return "Member{" +
                "curator=" + curator +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", logged=" + logged +
                '}';
    }

}
