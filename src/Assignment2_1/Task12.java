package Assignment2_1;

import java.util.Scanner;

public class Task12 {
    public static int[][] Array = new int[2][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(Array[i][j] + " ");
            }
        }
    }
}
