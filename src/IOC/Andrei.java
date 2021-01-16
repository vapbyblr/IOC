package IOC;

public class Andrei {

    public static int[] getDivisionalPartFromNumber(float[] floatArray) {
        int[] floatArrayToInt = new int[floatArray.length];
        for (int i = 0; i < floatArray.length; i++) {
            String floatToString = String.valueOf(floatArray[i]);
            int pointIndex = floatToString.indexOf('.');
            floatArrayToInt[i] = Integer.parseInt(floatToString.substring(pointIndex + 1));
        }
        return floatArrayToInt;
    }
}
