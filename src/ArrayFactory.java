public class ArrayFactory {
    public static int[] arrayMaker() {
        int[] newArray = new int[100];

        for (int i = 1; i <= newArray.length; i++) {
            if (i % 10 == 0) {
                newArray[i-1] = 0;
            } else {
                newArray[i-1] = i;
            }
        }

        return newArray;
    }
}