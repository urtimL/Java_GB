package lesson5HW;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    /*
    Написать программу, которая найдёт и выведет
    повторяющиеся имена с количеством повторений.
    Отсортировать по убыванию популярности.
     */
    public static void main(String[] args) {
        test(createArrayOfNames());
    }


    private static void test(String[] names){
        Map<String, Integer> newMap = new HashMap<>();
        for (String item : names) {
            if(newMap.containsKey(item)) newMap.put(item, newMap.get(item) + 1);
            else newMap.put(item, 1);
        }
        newMap.values().removeIf(value -> value == 1);

        newMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    private static String[] createArrayOfNames(){
        String names = "Иван Иванов," +
                "Светлана Петрова," +
                "Кристина Белова," +
                "Анна Мусина," +
                "Анна Крутова," +
                "Иван Юрин," +
                "Петр Лыков," +
                "Павел Чернов," +
                "Иван Иванов," +
                "Петр Чернышов," +
                "Мария Федорова," +
                "Марина Светлова," +
                "Мария Савина," +
                "Иван Иванов," +
                "Мария Рыкова," +
                "Анна Крутова," +
                "Марина Лугова," +
                "Анна Владимирова," +
                "Петр Лыков," +
                "Иван Мечников," +
                "Петр Петин," +
                "Петр Лыков," +
                "Иван Ежов";
        String[] arrNames = names.split(",");

        return arrNames;
    }
}
