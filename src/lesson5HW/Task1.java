package lesson5HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    /*
    Реализуйте структуру телефонной книги с помощью HashMap,
    учитывая, что 1 человек может иметь несколько телефонов.
     */
    public static void main(String[] args) {
        test();
    }

    public static Map <String, ArrayList<String>> map = new HashMap<>();

    private static void addRecord(String userName, String phoneNumber){
        if (map.containsKey(userName)) {
            if (!map.get(userName).contains(phoneNumber)) map.get(userName).add(phoneNumber);
        } else {
            ArrayList<String> newArr = new ArrayList<>();
            newArr.add(phoneNumber);
            map.put(userName, newArr);
        }
    }

    private static void test(){
        addRecord("Михаил", "5558855");
        addRecord("Михаил", "5557755");
        addRecord("Михаил", "5556655");

        addRecord("Петр", "4448855");
        addRecord("Петр", "4447755");

        addRecord("Павел", "9998877");
        addRecord("Павел", "9998877");//повторно введем тот-же номер


        for(Map.Entry entry: map.entrySet()) {
            System.out.println("имя: " + entry.getKey() + "\tтел.: " + entry.getValue());
        }
    }
}
