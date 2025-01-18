package Assignment2_1;
import java.util.Scanner;
//Reverse
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = input.nextInt();
        }
        if (N > 0){
            if (N % 2 == 0){
                for (int i = N-1; i >= 0; i--) {
                    System.out.println(result[i]);
                }
            }
            else {
                for (int i = 0; i < N; i++) {
                        System.out.println(result[i]);
                    }
                }
        }
    }
}
