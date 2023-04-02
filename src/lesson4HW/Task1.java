package lesson4HW;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    /**
     * Пусть дан LinkedList с несколькими элементами.
     * Реализуйте метод, который вернет “перевернутый” список.
     */


    /** вопросы
    public static int[] mas = new int[]{1, 2, 3, 4};
    public static List list = new LinkedList(Collections.singleton(mas));
     при System.out.println(List) выдает [[I@63961c42]

    public static List list = new LinkedList();
    list.add(1); // выдает ошибку java: illegal start of type и java: <identifier> expected
     */

    public static void main(String[] args) {
        revers(createList());
    }

    public static void revers(List ls) {
        Collections.reverse(ls);
        System.out.println("Стало вариант 1:");
        System.out.println(ls);
        System.out.println();

        List<Integer> reversed = new LinkedList<>();
        while(!ls.isEmpty()) reversed.add((Integer) ls.remove(ls.size()-1));
        System.out.println("Стало вариант 2:");
        System.out.println(reversed);
    }

    private static List createList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Было:");
        System.out.println(list);
        System.out.println();

        return list;
    }
}
