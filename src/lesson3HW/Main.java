package lesson3HW;

import lesson3HW.MergeSort;
import lesson3HW.Task2;

import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
    }
    private static void firstTask(){
        int [] mas = {11, 3, 14, 16, 7, 12};
        System.out.println("Реализовать алгоритм сортировки слиянием.");
        System.out.printf("было: ");
        System.out.println(Arrays.toString(mas));
        System.out.printf("стало: ");
        System.out.println(Arrays.toString(MergeSort.sortArray(mas)));
    }

    private static void secondTask() {
       // List<Integer> newList = Arrays.asList(11, 3, 14, 16, 7, 12);
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(11);
        newList.add(3);
        newList.add(14);
        newList.add(16);
        newList.add(7);
        newList.add(12);
        newList.add(5);

        System.out.println();
        System.out.println("Пусть дан произвольный список целых чисел, удалить из него чётные числа.");
        System.out.printf("было: ");
        System.out.println(newList);

        System.out.printf("стало: ");
        Task2.removeEvenNumbers(newList);
        System.out.println(newList);
    }

    private static void thirdTask(){
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(11);
        newList.add(3);
        newList.add(14);
        newList.add(16);
        newList.add(7);
        newList.add(12);
        newList.add(5);

        System.out.println();
        System.out.println("Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.");
        System.out.printf("было: ");
        System.out.println(newList);
        Task3.minMaxMean(newList);
    }

}

