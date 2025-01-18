package Assignment2_1;

import java.util.Scanner;

public class Task15 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i  = 0; i < 3; i ++){
            for (int j = 0; j < 3; j++){
                array[i][j] = input.nextInt();
            }
        }
        for (int j = 0; j < 3; j ++){
            System.out.println();
            for (int i = 0; i < 3; i++){
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
