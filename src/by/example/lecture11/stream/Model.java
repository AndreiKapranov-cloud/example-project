package by.example.lecture11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Model {

    private List<String> strings;

    public List<String> getStrings() {
        return strings;
    }

    public Model() {
        strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(UUID.randomUUID().toString());
        }
    }
}
