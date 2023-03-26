package lesson2;
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая
//состоит из чередующихся символов c1 и c2, начиная с c1


public class Task1 {
    public static String getRepeatString(int numN){
        StringBuilder sb = new StringBuilder();
//        sb.append("c1");
        for (int i = 1; i <= numN/2; i++) {
            if(i % 2 == 0) sb.append("c2");
            else sb.append("c1");

        }
        System.out.println(sb.toString().length());
        return sb.toString();
    }
}
