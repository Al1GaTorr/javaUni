package Assignment2_1;
import java.util.Arrays;
//Merging arrays
public class Task4 {
    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[firstArray.length + secondArray.length];
    public static void main(String[] args) {
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
