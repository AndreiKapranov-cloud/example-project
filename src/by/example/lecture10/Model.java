package by.example.lecture10;

import java.util.Objects;
import java.util.UUID;

public class Model implements Comparable<Model> {

    private String value;

    public Model() {
        value = UUID.randomUUID().toString();
    }

    public Model(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(Model model) {
        // can be replaced by
//        return Integer.compare(this.value.compareTo(model.value), 0);

        if (this.value.compareTo(model.value) < 0) {
            return -1;
        }
        if (this.value.compareTo(model.value) > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Model{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || getClass() != that.getClass()) {
            return false;
        }
        Model model = (Model) that;
        return Objects.equals(value, model.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
