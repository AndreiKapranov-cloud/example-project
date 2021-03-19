package by.example.lecture20.annotation;

public class Processor {

    public void process(Class aClass) throws NoSuchFieldException {
        Annotation annotation = aClass.getField("field").getAnnotation(Annotation.class);
        String value = annotation.value();
        System.out.println(value);
    }

}
