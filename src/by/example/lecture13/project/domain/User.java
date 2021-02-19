package by.example.lecture13.project.domain;

import java.io.Serializable;
import java.util.Objects;

public abstract class User implements Loggable, Comparable<User>, Serializable {

    private static final long serialVersionUID = 1L;
    protected String login;
    protected String password;
    protected boolean logged;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean login() {
        if (!logged) {
            logged = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logout() {
        logged = false;
    }

    @Override
    public int compareTo(User user) {
        int result = this.login.compareTo(user.getLogin());
        result = result == 0 ? this.password.compareTo(user.getPassword()) : result;
        result = result == 0 ? (this.logged == user.isLogged() ? 0 : 1) : result;
        return result;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || getClass() != that.getClass()) {
            return false;
        }
        User user = (User) that;
        return logged == user.logged
                && Objects.equals(login, user.login)
                && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, logged);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", logged=" + logged +
                '}';
    }

}
