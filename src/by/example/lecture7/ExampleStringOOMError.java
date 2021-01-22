package by.example.lecture7;

public class ExampleStringOOMError {

    public static void main(String[] args) {

        String str = "";

        for (int i = 0; i < 100_000; i++) {
            for (int j = 0; j < 100_000; j++) {
                str += i + "_" + j + " ";
            }
        }

        System.out.println(str);

    }

}
