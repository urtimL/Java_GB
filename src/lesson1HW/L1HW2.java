package lesson1HW;

import java.util.Scanner;

public class L1HW2 {
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String str = scanner.next();
        try {
            int numb = Integer.parseInt(str);
            int rez = 1;
            for(int i = 1; i <= numb; i++) {
                rez *= i;
            }
            System.out.println(rez);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
}
