package lesson2HW;
//Дана строка json:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

//Написать метод, который распарсит этот текст и,
// используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет].
// Например:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
public class Lesson2Homework2 {
    public static void parseText(String str) {
        String[] arr = str.split("},");
        for (String item: arr) {
            StringBuilder res = new StringBuilder();
            String[] arrStr = new String[3];
            String[] arr1 = item.split("," );
            int count = 0;
            for (String item1: arr1) {
                String[] arr2 = item1.split("\"" );
                arrStr[count] = (arr2[3]);
                count++;
            }

            res.append(String.format("Студент %s получил %s по предмету %s.", arrStr[0], arrStr[1], arrStr[2]));
            System.out.println(res.toString());
        }
    }
}
