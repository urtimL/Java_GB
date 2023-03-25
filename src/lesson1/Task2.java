package lesson1.task1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;

public class Task2 {
    public static void hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = scanner.next();

        LocalDateTime now = LocalDateTime.now();
        if(now.isAfter(ChronoLocalDateTime.from(LocalTime.of(6,0))) &&
            now.isAfter(ChronoLocalDateTime.from(LocalTime.of(11,59)))){
            System.out.printf("Good morning, " + userName);
        } else if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(12,0))) &&
                now.isAfter(ChronoLocalDateTime.from(LocalTime.of(17,59)))) {
            System.out.printf("Good day, " + userName);
        } else if (now.isAfter(ChronoLocalDateTime.from(LocalTime.of(18,0))) &&
                now.isAfter(ChronoLocalDateTime.from(LocalTime.of(22,59)))){
            System.out.printf("Good evening, " + userName);
        } else {
            System.out.printf("Good night, " + userName);
        }
    }
}
