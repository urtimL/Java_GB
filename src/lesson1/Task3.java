package lesson1;

public class Task3 {
    public static int getMaxOneCount(int[] args) {
        int maxCount = 0;
        int count = 0;

        for (int item: args){
            if(item == 1) count++;
            else {
                if (count > maxCount) maxCount = count;
                count = 0;
            }
        }
        if (count > maxCount) maxCount = count;

        return maxCount;
    }
}
