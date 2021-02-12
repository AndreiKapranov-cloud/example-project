package by.example.lecture12.storage;

import by.example.lecture12.domain.Resource;
import by.example.lecture12.domain.ResourceType;

import java.util.ArrayList;
import java.util.List;

public final class Storage {

    private Storage() {

    }

    // Map can be used instead of List
    private static List<Resource> resources = new ArrayList<>();

    static {
        resources.add(new Resource("FS resource", ResourceType.FILE_SYSTEM, 1000));
        resources.add(new Resource("Network resource", ResourceType.NETWORK, 5000));
        resources.add(new Resource("DB resource", ResourceType.DATABASE, 3000));
    }

    public static Resource getResourceByName(String name) {
        return resources.stream()
                .filter(resource -> resource.getName().equals(name))
                .findAny()
                .get();
    }

    public static void saveResource(Resource resource) {
        resources.add(resource);
    }

}
