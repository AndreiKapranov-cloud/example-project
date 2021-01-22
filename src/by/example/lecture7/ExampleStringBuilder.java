package by.example.lecture7;

public class ExampleStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Str: ");
        for (int i = 0; i < 100; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);

        sb.insert(10, "str");
        System.out.println(sb);

        sb.delete(34, 78);

        String str = sb.toString();
        System.out.println(str);

    }

}
