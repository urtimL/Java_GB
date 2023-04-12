package lesson6HW;

import java.util.*;

public class Work {
    private static Map<Integer, String> filterCriteria;
    private static Map<String, String> selectedSelectionCriteria;
    private static HashSet<Laptop> laptops;
    private static ArrayList<String> brand;
    private static Map<String, ArrayList<String>> brandModel;
    private static ArrayList<String> cdu;
    private static ArrayList<Integer> hdd;
    private static ArrayList<Integer> ram;
    private static ArrayList<String> os;
    private static ArrayList<String> color;


    private static void fillFilterCriteria() {
        filterCriteria = new HashMap<>();
        filterCriteria.put(1, "brand");
        filterCriteria.put(2, "model");
        filterCriteria.put(3, "cdu");
        filterCriteria.put(4, "hdd");
        filterCriteria.put(5, "ram");
        filterCriteria.put(6, "os");
        filterCriteria.put(7, "color");
    }

    private static void fillParameters() {
        cdu = new ArrayList<>(Arrays.asList("Intel", "AMD"));
        hdd = new ArrayList<>(Arrays.asList(128, 256, 512, 1024, 2048));
        ram = new ArrayList<>(Arrays.asList(4, 8, 16, 24, 32));
        os = new ArrayList<>(Arrays.asList("Windows", "Linux", "-"));
        color = new ArrayList<>(Arrays.asList("black", "white", "silver", "red", "blue", "grey", "dark grey"));
        brand = new ArrayList<>(Arrays.asList("Acer", "Dell", "HP", "Asus"));
        /*
        Для бренда и его моделей можно класс создать, но в жизни скорей всего эта информация в базе данных
        храниться будет поэтому сделал через Map.
         */
        brandModel = new HashMap<>();
        brandModel.put("Acer", new ArrayList<>(Arrays.asList("Swift 3", "Swift 5", "Swift X",
                "Aspire 3", "Aspire 5", "Aspire 7",
                "Spin 1", "Spin 3", "Spin 5",
                "Nitro 5", "Nitro 7", "Nitro 16")));
        brandModel.put("Dell", new ArrayList<>(Arrays.asList("INSPIRON 3000", "INSPIRON 5000", "INSPIRON 7000",
                "XPS 13", "XPS 15", "XPS 17",
                "Latitude 3000", "Latitude 5000", "Latitude 7000",
                "Precision 3000", "Precision 5000", "Precision 7000")));
        brandModel.put("HP", new ArrayList<>(Arrays.asList("Envy 15", "Envy 16", "Envy 17",
                "Pavilion 350", "Pavilion 550", "Pavilion 750",
                "ProBook 3i", "ProBook 5i", "ProBook 7i",
                "ZBook 13", "ZBook 14", "ZBook 15")));
        brandModel.put("Asus", new ArrayList<>(Arrays.asList("Zenbook 15", "Zenbook 16", "Zenbook 17",
                "VivoBook 350", "VivoBook 550", "VivoBook 750",
                "Rog Strix 14", "Rog Strix 15", "Rog Strix 16",
                "Tug Gaming F15", "Tug Gaming F17", "Tug Gaming F19")));
    }

    private static Map<String, String> getParameters() {
        int numbBrand = new Random().nextInt(brand.size());
        int numbModel = new Random().nextInt(11);
        int numbCdu = new Random().nextInt(cdu.size());
        int numbHdd = new Random().nextInt(hdd.size());
        int numbRam = new Random().nextInt(ram.size());
        int numbOS = new Random().nextInt(os.size());
        int numbColor = new Random().nextInt(color.size());

        String br = brand.get(numbBrand);
        ArrayList<String> models = brandModel.get(br);

        Map<String, String> res = new HashMap<>();
        res.put("brand", br);
        res.put("model", models.get(numbModel));
        res.put("cdu", cdu.get(numbCdu));
        res.put("os", os.get(numbOS));
        res.put("color", color.get(numbColor));
        res.put("hdd", hdd.get(numbHdd).toString());
        res.put("ram", ram.get(numbRam).toString());

        return res;
    }

    private static void createSetLaptops() {
        laptops = new HashSet<>();
        Map<String, String> par;
        for (int i = 0; i < 10; i++) {
            par = getParameters();
            laptops.add(new Laptop(par.get("brand"),
                    par.get("model"), par.get("cdu"),
                    Integer.parseInt(par.get("hdd")),
                    Integer.parseInt(par.get("ram")),
                    par.get("os"), par.get("color")));
        }
    }

    private static void filter() {

        filterCriteria.forEach((key, value) -> System.out.println(key + ". " + value));
        System.out.println("Введите цифру, соответствующую необходимому критерию: ");
        String userText = userData();
        String[] arr = userText.split(",");

        selectedSelectionCriteria = new LinkedHashMap<>();//запишем выбранные пользователем критерии в Map
        for (String i : arr) {
            int k = Integer.parseInt(i);
            selectedSelectionCriteria.put(filterCriteria.get(k), "");
        }

        System.out.println("Введите минимальные значения для указанных критериев");
        for (Map.Entry<String, String> entry : selectedSelectionCriteria.entrySet()) {
            String key = entry.getKey();
            System.out.print("Введите минимальные значения для " + key + ": ");
            selectedSelectionCriteria.put(key, userData());
        }

        //selectedSelectionCriteria.forEach((key, value) -> System.out.println(key + ". " + value));

        for (Laptop i: laptops) {
            if(canPrint(i)) System.out.println(i);
        }
    }

    private static boolean canPrint(Laptop lp) {
        boolean res = true;
        for (Map.Entry<String, String> entry : selectedSelectionCriteria.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(key.equals("brand")){
                res = res && value.equals(lp.brand);
            } else if (key.equals("model")) {
                res = res && value.equals(lp.model);
            } else if (key.equals("cdu")) {
                res = res && value.equals(lp.cdu);
            } else if (key.equals("hdd")) {
                Integer val = Integer.valueOf(value);
                res = res && lp.hdd >= val;
            } else if (key.equals("ram")) {
                Integer val = Integer.valueOf(value);
                res = res && lp.ram >= val;
            } else if (key.equals("os")) {
                res = res && value.equals(lp.os);
            } else if (key.equals("color")) {
                res = res && value.equals(lp.color);
            }
        }

        return res;
    }

    private static String userData() {
        String str = "";
        try {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.err.println(e);
        }

        return str;
    }

    public static void test() {
          fillParameters();
          createSetLaptops();
        for (Laptop i: laptops) {
            System.out.println(i);
        }
        fillFilterCriteria();
        filter();
    }
}
