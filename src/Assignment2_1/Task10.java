package Assignment2_1;
import java.util.Scanner;
import java.util.Arrays;
public class Task10 {
    public static int[][] MultiArray;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        MultiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int len = input.nextInt();
            MultiArray[i] = new int[len];
        }
        for (int[] row : MultiArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}