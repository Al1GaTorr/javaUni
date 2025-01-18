package Assignment2_1;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        char[][] pyramid = new char[N][2 * N - 1];
        for (int i = 0; i < N; i++) {
            int space = N - i - 1;
            int reshetka = 2 * i + 1;
            for (int j = 0; j < space; j++) {
                pyramid[i][j] = ' ';
            }
            for (int j = space; j < space + reshetka; j++) {
                pyramid[i][j] = '#';
            }
            for (int j = space + reshetka; j < 2 * N - 1; j++) {
                pyramid[i][j] = ' ';
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                System.out.print(pyramid[i][j]);
            }
            System.out.println();
        }
    }
}

