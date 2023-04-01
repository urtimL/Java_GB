package lesson3HW;


import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void removeEvenNumbers(ArrayList<Integer> list) {
        Iterator<Integer> listIterator = list.iterator();
        while(listIterator.hasNext()) {
            Integer nextNumb = listIterator.next();
            if (nextNumb % 2 == 0) {
                listIterator.remove();
            }
        }
    }
}
