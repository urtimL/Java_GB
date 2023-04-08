package lesson5HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*
    Не обязательно. Написать метод, который переводит
    число из римского формата записи в арабский.
    Например, MMXXII = 2022
     */

    public static Map<String, Integer> map = new HashMap<>();
    public static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        test("MMXXII"); // 2022
        test("DCCCLXXXVIII"); // 888
        test("MDCCCLXXXVIII"); // 1888
    }

    private static void test(String dateInLatin) {
        fillMapAndArray();
        String[] arrLetters = dateInLatin.split("");
        Integer date = 0;
        for (int i = 0; i < arrLetters.length; i++) {
            if (i == 0) date += map.get(arrLetters[i]);
            else date += calculateNumber(arrLetters[i - 1], arrLetters[i]);
        }
        System.out.println(dateInLatin + " = " + date.toString());
    }

    private static Integer calculateNumber(String previous, String current) {
        if (arrayList.contains(previous) &&
                !previous.equals(current) &&
                map.get(current) > map.get(previous)) {
            return map.get(current) - map.get(previous) * 2;
        }

        return map.get(current);
    }

    private static void fillMapAndArray() {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        arrayList.add("I");
        arrayList.add("X");
        arrayList.add("C");
        arrayList.add("I");
        arrayList.add("M");
    }
}
