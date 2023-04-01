package lesson3HW;

import lesson3HW.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        firstTask();
    }
    private static void firstTask(){
        int [] mas = {11, 3, 14, 16, 7, 12};
        System.out.printf("было: ");
        System.out.println(Arrays.toString(mas));
        System.out.printf("стало: ");
        System.out.println(Arrays.toString(MergeSort.sortArray(mas)));
    }
}

