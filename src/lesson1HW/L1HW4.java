package lesson1HW;

import java.util.Scanner;

public class L1HW4 {
    public static void calculator() {
        Scanner scNumber1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String num1 = scNumber1.next();

        Scanner scProcedure = new Scanner(System.in);
        System.out.println("Введите операцию (+, -, *, /): ");
        String pr = scProcedure.next();

        Scanner scNumber2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        String num2 = scNumber2.next();

        try {
            int numb1 = Integer.parseInt(num1);
            int numb2 = Integer.parseInt(num2);

            if (pr.equals("+")) System.out.println(numb1 + numb2);
            else if (pr.equals("-")) System.out.println(numb1 - numb2);
            else if (pr.equals("*")) System.out.println(numb1 * numb2);
            else if (pr.equals("/")) System.out.println(numb1 / numb2);
            else System.out.println("Был введен не верный ператор!");

        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
}
