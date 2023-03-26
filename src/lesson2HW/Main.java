package lesson2HW;

import lesson2HW.Lesson2Homework1;
import lesson2HW.Lesson2Homework2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    private static void firstTask(){
        int [] mas = {11, 3, 14, 16, 7};
        Lesson2Homework1.mergeSort(mas);
        System.out.println(Arrays.toString(mas));
    }

    private static void secondTask() {
        String str = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                      "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                      "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        Lesson2Homework2.parseText(str);
    }
}
