package by.example.lecture2;

public class ExampleFloatingDataTypes {

    public static void main(String[] args) {

//        float floatVar = 67454.3478F;
        float floatVar1 = 67454.3478f;
        float floatVar2 = 8769.7685f;
        System.out.println("floatVar1 = " + floatVar1);
        System.out.println("floatVar2 = " + floatVar2);
        System.out.println("floatVar1 + floatVar2 = " + (floatVar1 + floatVar2));

//        double doubleVar1 = 67454.3478d;
//        double doubleVar1 = 67454.3478D;
        double doubleVar1 = 67454.3478;
        double doubleVar2 = 8769.7685;
        System.out.println("doubleVar1 = " + doubleVar1);
        System.out.println("doubleVar2 = " + doubleVar2);
        System.out.println("doubleVar1 + doubleVar2 = " + (doubleVar1 + doubleVar2));

        int intVar1 = 17;
        int intVar2 = 17;
        float floatVar = (float) intVar1 + intVar2;
        System.out.println("floatVar = " + floatVar);

    }

}
