package by.example.lecture3;

import java.util.Random;

public class ExampleControlOperators {

    private static final Random random = new Random();

    public static void main(String[] args) {

        int a = random.nextInt(15) + 10; // 10..24
//        int a = 21;

        System.out.println("a = " + a);

        System.out.println("IF");
        if (a > 15 && a < 20) {
            System.out.println("a > 15 && a < 20");
        }

        System.out.println("IF-ELSE");
        if (a > 15 && a < 20) {
            System.out.println("hooray!");
        } else {
            System.out.println("oh no...");
        }

        System.out.println("SWITCH");
        switch (a) {
            case 10:
                System.out.println(10);
                break;
            case 15:
                System.out.println(15);
                break;
            case 17:
                System.out.println(17);
                break;
            case 21:
                System.out.println(21);
                break;
            default:
                System.out.println("not 10, 15, 17, 21");
        }

        if (a == 10) {
            System.out.println(10);
        } else {
            if (a == 15) {
                System.out.println(15);
            } else {
                if (a == 17) {
                    System.out.println(17);
                } else {
                    if (a == 21) {
                        System.out.println(21);
                    } else {
                        System.out.println("not 10, 15, 17, 21");
                    }
                }
            }
        }

        if (a == 10) {
            System.out.println(10);
        } else if (a == 15) {
            System.out.println(15);
        } else if (a == 17) {
            System.out.println(17);
        } else if (a == 21) {
            System.out.println(21);
        } else {
            System.out.println("not 10, 15, 17, 21");
        }


    }

}
