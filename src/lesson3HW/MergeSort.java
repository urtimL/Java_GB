package lesson3HW;

import java.util.Arrays;

public class MergeSort {
    public static int[] sortArray(int[] arrStart){
        if (arrStart == null) {
            return null;
        }

        int arrLength = arrStart.length;
        if (arrLength < 2) {
            return arrStart;
        }

        int arrHalfLength = arrLength / 2;
        int arrRest = arrLength - arrHalfLength;

        int [] arrLeft = new int[arrHalfLength];
        System.arraycopy(arrStart, 0, arrLeft, 0, arrHalfLength);

        int [] arrRight = new int[arrRest];
        System.arraycopy(arrStart, arrHalfLength, arrRight, 0, arrRest);

        return mergeArray(sortArray(arrLeft), sortArray(arrRight));
    }

    private static int [] mergeArray(int [] left, int [] right) {
        int leftLen = left.length;
        int rightLen = right.length;
        int resultLen = leftLen + rightLen;

        int[] result = new int[resultLen];
        int resIn = 0, leftIn = 0, rightIn = 0;

        while (leftIn < leftLen && rightIn < rightLen) {
            if (left[leftIn] < right[rightIn]) {
                result[resIn++] = left[leftIn++];
            }
            else result[resIn++] = right[rightIn++];
        }
        while (resIn < resultLen) {
            if (leftIn != leftLen) {
                result[resIn++] = left[leftIn++];
            }
            else result[resIn++] = right[rightIn++];
        }

        return result;
    }
}