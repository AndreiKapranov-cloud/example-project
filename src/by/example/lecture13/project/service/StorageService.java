package by.example.lecture13.project.service;

import by.example.lecture13.project.domain.User;

import java.util.List;

public interface StorageService {

    void save(List<User> users);

    List<User> loadUsers();

}
