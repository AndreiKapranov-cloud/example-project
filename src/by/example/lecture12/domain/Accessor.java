package by.example.lecture12.domain;

import by.example.lecture12.exception.NotAcceptableResourceTypeException;

public interface Accessor {

    Resource getResource(String name) throws NotAcceptableResourceTypeException;

    boolean saveResource(Resource resource);

    void establishConnection(Resource resource);

}
