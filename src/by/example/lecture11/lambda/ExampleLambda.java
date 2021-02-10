package by.example.lecture11.lambda;

public class ExampleLambda {

    public static void main(String[] args) {

//        Interface interfaceObject = new Interface() {
//            @Override
//            public void method(String param) {
//                if (param.length() > 10) {
//                    System.out.println("WARNING: line is longer than 10 symbols");
//                }
//                System.out.println(param);
//            }
//        };

        Interface interfaceObject = (parameter, maxLength) -> {
            if (parameter.length() > maxLength) {
                System.out.println("WARNING: line is longer than " + maxLength + " symbols");
            }
            System.out.println(parameter);
        };

        interfaceObject.method("Line fhgsirhugf", 10);

        ExternalClass.method(interfaceObject);

    }

}
