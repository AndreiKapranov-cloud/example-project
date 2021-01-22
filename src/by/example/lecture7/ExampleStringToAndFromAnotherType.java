package by.example.lecture7;

public class ExampleStringToAndFromAnotherType {

    public static void main(String[] args) {

        Integer integer = 17;
        System.out.println(integer.toString());
        System.out.println(integer);

        System.out.println(String.valueOf(integer));

        String byteString = "7";
//        String byteString = "768684"; // Value out of range
//        String byteString = "gjhxdhd"; // NumberFormatException
        byte byteVar = Byte.parseByte(byteString);
        System.out.println("byteVar = " + byteVar);

        String floatString = "5.5";
        float floatVar = Float.parseFloat(floatString);
        System.out.println("floatVar = " + floatVar);

        String booleanString = "true";
        boolean booleanVar = Boolean.parseBoolean(booleanString);
        System.out.println("booleanVar = " + booleanVar);

    }

}
