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
}
