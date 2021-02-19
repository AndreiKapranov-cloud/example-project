package by.example.lecture13.project.service.impl;

import by.example.lecture13.project.domain.User;
import by.example.lecture13.project.service.SerializationService;
import by.example.lecture13.project.service.StorageService;

import java.util.List;

public class DbStorageService implements StorageService {

    private static final String STORAGE_FILENAME = "resources/db.txt";

    @Override
    public void save(List<User> users) {
        SerializationService.serialize(users, STORAGE_FILENAME);
        System.out.println("Users are saved.");
    }

    @Override
    public List<User> loadUsers() {
        List<User> deserialized = (List<User>) SerializationService.deserialize(STORAGE_FILENAME);
        System.out.println("Users are loaded.");
        return deserialized;
    }

}
