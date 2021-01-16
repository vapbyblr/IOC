package IOC;

import java.util.Arrays;

public class Alexei {
    public static boolean comparisonOfTwoIntArrays(float[] floatArray, String[] stringArray) {
        int[] floatArrayToInt = getDivisionalPartFromNumber(floatArray);
        int[] stringArrayToInt = deleteLettersInStringArray(stringArray);
        if (floatArrayToInt.length != stringArrayToInt.length) {
            return false;
        } else {
            quickSort(floatArrayToInt, 0, floatArrayToInt.length - 1);
            System.out.println("floatArray sort " + Arrays.toString(floatArrayToInt));
            quickSort(stringArrayToInt, 0, stringArrayToInt.length - 1);
            System.out.println("stringArray sort " + Arrays.toString(stringArrayToInt));
            for (int i = 0; i < floatArrayToInt.length; i++) {
                if (floatArrayToInt[i] != stringArrayToInt[i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }
}
