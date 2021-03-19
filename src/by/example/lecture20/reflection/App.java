package by.example.lecture20.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

    public static void main(String[] args) throws ClassNotFoundException,
            NoSuchFieldException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {

        Model model = new Model();
        System.out.println(model);

        Field nameField = Model.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(model, "value");
        System.out.println(model);

        Method printNameMethod = Model.class.getDeclaredMethod("printName");
        printNameMethod.setAccessible(true);
        printNameMethod.invoke(model);

        Method printNameWithAdditionalDataMethod = Model.class.getDeclaredMethod("printNameWithAdditionalData", String.class, int.class);
        printNameWithAdditionalDataMethod.setAccessible(true);
        printNameWithAdditionalDataMethod.invoke(model, "prefix", 3);

    }
    // getDeclared... - get all ... from class, but not inherited
    // get... - get all public ... from class with inherited

    private static void showCast() {
        Object objectToCast = new Object();
//        System.out.println(castToModel(objectToCast));
        System.out.println(castToModelViaReflection(objectToCast));
    }

    private static Model castToModel(Object objectToCast) {
        return (Model) objectToCast;
    }

    private static Model castToModelViaReflection(Object objectToCast) {
        return Model.class.cast(objectToCast);
    }

    private static <T> T castToModelViaReflection(Class<T> classToCast, Object objectToCast) {
        return classToCast.cast(objectToCast);
    }

    private static void showGetClass() throws ClassNotFoundException {
        Class<Model> modelClass = Model.class;
        System.out.println(modelClass);

        Model model = new Model();
        System.out.println(model.getClass());

        System.out.println(Class.forName("by.example.lecture20.reflection.Model"));
        System.out.println(Class.forName("Model"));
    }

}
