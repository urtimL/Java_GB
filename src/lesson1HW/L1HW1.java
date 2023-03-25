package lesson1HW;

import java.util.Scanner;

public class L1HW1 {
    public static void triangularNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String str = scanner.next();
        try {
            int numb = Integer.parseInt(str);
            int rez = 0;
            for(int i = 1; i <= numb; i++) {
                rez += i;
            }
            System.out.println(rez);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
}
