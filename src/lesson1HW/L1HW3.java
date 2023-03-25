package lesson1HW;

import java.util.Scanner;

public class L1HW3 {
    public static void primeNumbersFrom1To1000() {
        String rez = "";
        int count = 0;
        for(int i = 2; i <= 1000; i++) {
            for (int k = i - 1; k >= 1; k--){
                if (i % k == 0 && k != 1) {
                    break;
                } else if (i % k == 0 && k == 1) {
                    rez += " " + Integer.toString(i);
                    count++;
                    if (count == 10) {
                        System.out.println(rez);
                        rez = "";
                        count = 0;
                    }
                }
            }
        }

    }
}
