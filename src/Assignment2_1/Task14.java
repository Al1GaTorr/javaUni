package Assignment2_1;

import java.util.Scanner;

public class Task14 {
        public static int[][] array = new int[3][3];
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int min = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < 3; i++){
                int sum = 0;
                for (int j = 0; j < 3; j++) {
                    sum += array[i][j];
                }
                if (sum < min) min = sum;
            }
            for (int j = 0; j < 3; j++){
                int sum = 0;
                for (int i = 0; i < 3; i++) {
                    sum += array[i][j];
                }
                if (sum < min) min = sum;
            }
            System.out.println(min);
        }
    }
