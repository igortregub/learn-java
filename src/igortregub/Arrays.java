package igortregub;

public class Arrays {

    public static void main(String[] args) {
        int[] a = {0, 7, 8, 15, 17};
        int[] b = {1, 4, 6, 8, 9};

        System.out.println(java.util.Arrays.toString(merge(a, b)));
    }

    /**
     * Merge 2 sorted arrays to one array
     *
     * @param a first array
     * @param b second array
     * @return int[]
     */
    public static int[] merge(int[] a, int[] b) {
        int arrayLength = a.length + b.length;
        int[] mergedArray = new int[arrayLength];

        final int aLength = a.length;
        final int bLength = b.length;

        int aCurrentPosition = 0;
        int bCurrentPosition = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (aCurrentPosition >= aLength) {
                mergedArray[i] = b[bCurrentPosition++];
            } else if (bCurrentPosition >= bLength) {
                mergedArray[i] = a[aCurrentPosition++];
            } else if (a[aCurrentPosition] > b[bCurrentPosition]) {
                mergedArray[i] = b[bCurrentPosition++];
            } else {
                mergedArray[i] = a[aCurrentPosition++];
            }
        }

        return mergedArray;
    }
}
