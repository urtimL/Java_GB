package lesson3HW;

import java.util.ArrayList;

public class Task3 {
    public static void minMaxMean(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        double sum = 0;
        int count = 1;

        for (Integer i : list) {
            count++;
            sum += i;

            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }

        System.out.println("минимальное значение - " + min);
        System.out.println("максимальное значение - " + max);
        System.out.println("среднее значение - " + sum / count);
    }
}
