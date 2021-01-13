package by.example.lecture2;

public class ExampleSymbolDataTypes {

    public static void main(String[] args) {

        char charVar1 = 'a';
        System.out.println("charVar1 = " + charVar1);

        char charVar2 = '\u0160';
        System.out.println("charVar2 = " + charVar2);

        String str1 = "Hello!";
        System.out.println("str1 = " + str1);

        String str2 = "Hello! \n Next line"; // next line
        System.out.println("str2 = " + str2);

        String str3 = "Hello! \\n Next line"; // just backward slash
        System.out.println("str3 = " + str3);

    }

}
