
public class Finder {

    public int[] intArray;


    public static Integer findMax(int[] intArray) {

        int max;

if (intArray == null || intArray.length == 0) {

    System.out.println("null");
    return null;

}
    max = intArray[0];
    for (int i = 1; i < intArray.length; i++) {
        if (intArray[i] > max) {
            max = intArray[i];
        }
    }
        System.out.println("Maximum value is: " + max);
       return max;

    }

    public static Integer findMin(int[] intArray) {

        int min;

        if (intArray == null || intArray.length == 0) {

            System.out.println("null");
            return null;
        }

        min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }

        System.out.println("Minimum value is: " + min);
        return min;
    }
}
