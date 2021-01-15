package by.example.lecture5.practice;

import java.util.Scanner;

public class Practice_13_5 {

    /*
    Назовем «базой» положительного числа Х сумму
    всех положительных целых чисел, меньших Х.
    Напишите класс, который принимает с клавиатуры
    положительное целое число Х и подсчитывает его «базу».
     */
    public static void main(String[] args) {

        // base of X: X-1+X-2+X-3+...+1
        // base of X: 1+...+X-3+X-2+X-1
        // base of 4: 3+2+1 = 6

        // 1. get X from keyboard
        System.out.println("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        // 2. create variable for base
        int base = 0;

        // 3. calculate base
        for (int i = 1; i < x; i++) {
            base += i;
        }

        // 4. print base
        System.out.println("Base: " + base);

    }

}
