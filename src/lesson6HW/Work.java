package lesson6HW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Work {
    private static Map<Byte,String> filterCriteria = new HashMap<>();
    private static Map<Byte,String> selectedSelectionCriteria  = new HashMap<>();
    private static void createFilterCriteria(){
        filterCriteria.put(1,"brand");
        filterCriteria.put(2,"model");
        filterCriteria.put(3,"cdu");
        filterCriteria.put(4,"hdd");
        filterCriteria.put(5,"ram");
        filterCriteria.put(6,"os");
        filterCriteria.put(7,"color");
    }

    private static void createSetLaptops(){
        HashSet<Laptop> laptops = new HashSet<>();

        for (int i = 0; i < 500; i++) {
          //  laptops.add(new Laptop(""));
        }
    }
}
