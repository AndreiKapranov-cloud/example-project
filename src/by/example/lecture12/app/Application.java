package by.example.lecture12.app;

import by.example.lecture12.domain.Accessor;
import by.example.lecture12.domain.Resource;
import by.example.lecture12.exception.NotAcceptableResourceTypeException;
import by.example.lecture12.service.FileSystemAccessor;

public class Application {

    public static void main(String[] args) {

        Accessor fileSystemAccessor = new FileSystemAccessor();
        Resource fsResource;
        try {
            fsResource = fileSystemAccessor.getResource("FS resource");
            System.out.println(fsResource);
            fsResource = fileSystemAccessor.getResource("Network resource");
            System.out.println(fsResource);
        } catch (NotAcceptableResourceTypeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("GOOD JOB");
        }

        System.out.println("EXIT");

    }

}
