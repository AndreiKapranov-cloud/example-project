package by.example.lecture2;

public class ExampleIntegerDataTypes {

    public static void main(String[] args) {

// not allowed to use variable that not initialized
//        byte byteVar;

// not allowed to have two variables with the same name
//        byte byteVar = 3;
//        byte byteVar = 3;

//        byte byteVar = 3; // implicit casting from int to byte

        byte byteVar = (byte) 128; // explicit casting from int to byte
        System.out.println("byteVar = " + byteVar);


//        short shortVar = 128; // implicit casting from int to short

        short shortVar = (short) 32768; // explicit casting from int to short
        System.out.println("shortVar = " + shortVar);

        int intVar = 824675257;
        System.out.println("intVar = " + intVar);

//        long longVar = 1531534543451l; // don't use lower case 'l'
//        long longVar = 1_531_534_543_451L;
        long longVar = 1531534543451L;
        System.out.println("longVar = " + longVar);


    }

}
