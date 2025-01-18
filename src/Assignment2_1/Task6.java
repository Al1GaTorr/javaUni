package Assignment2_1;
import java.util.Scanner;
//Maximum of N numbers
public class Task6 {
    public static int[] array;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        array = new int[N];
        int max = array[0];
        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
            if (max < array[i]) max  = array[i];
        }
        System.out.println(max);
    }

}
