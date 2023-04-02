package lesson4HW;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    /**
     * Реализуйте очередь с помощью LinkedList со следующими методами:
     * enqueue() - помещает элемент в конец очереди,
     * dequeue() - возвращает первый элемент из очереди и удаляет его,
     * first() - возвращает первый элемент из очереди, не удаляя.
     */

    public static void main(String[] args) {
        LinkedList<String> ls = createList();
        enqueue("Последний элемент", ls);
        String firstEl = dequeue(ls);
        System.out.println("Полученый первый элемент списка:");
        System.out.println(firstEl);
        System.out.println();

        firstEl = first(ls);
        System.out.println("Полученый первый элемент списка:");
        System.out.println(firstEl);
    }

    private static void enqueue(String el, LinkedList<String> ls){
        ls.addLast(el);

        System.out.println("В конец список дбавлн элмент:");
        System.out.println(ls);
        System.out.println();
    }

    private static String dequeue(LinkedList<String> ls) {
        String firstEl = ls.removeFirst();

        System.out.println("Список после получения первого эллемента (с удалением):");
        System.out.println(ls);
        System.out.println();

        return firstEl;
    }

    private static String first(LinkedList<String> ls) {
        String firstEl = ls.getFirst();
        System.out.println("Список после получения первого эллемента (без удалениея):");
        System.out.println(ls);
        System.out.println();

        return firstEl;
    }

    private static LinkedList<String> createList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("1 элемент");
        list.add("2 элемент");
        list.add("3 элемент");
        list.add("4 элемент");
        list.add("5 элемент");

        System.out.println("Было:");
        System.out.println(list);
        System.out.println();

        return list;
    }

}
