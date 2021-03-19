package by.example.lecture20.annotation;

public class App {

    public static void main(String[] args) throws NoSuchFieldException {

        Model model = new Model();

        Processor processor = new Processor();

        processor.process(model.getClass());

    }

}
