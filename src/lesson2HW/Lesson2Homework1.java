package lesson2HW;

//1. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
//(через FileWriter).


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Lesson2Homework1 {
    public static void mergeSort(int [] mas) {
        boolean isSorted = false;
        int buf;
        StringBuilder sb = new StringBuilder();

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;

                    write(Arrays.toString(mas));
                }
            }
        }
    }
    private static void write(String str) {
        File myFile = new File("test.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
            String lineSeparator = System.getProperty("line.separator");
            writer.write(str + lineSeparator);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
