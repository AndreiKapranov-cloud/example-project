package by.example.lecture20.reflection;

public class Model {

    private String name;

    private void printName() {
        System.out.println("name: " + name);
    }

    private void printNameWithAdditionalData(String prefix, int number) {
        System.out.println(prefix + "_" + name + "_" + number);
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                '}';
    }

}
