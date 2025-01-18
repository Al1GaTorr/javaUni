package Assignment2_1;
//Multiplication table
public class Task8 {
    public static int[][] MULTIPLICATION_TABLE = new int[10][10];
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = i * j;
            }
        }
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
        }
    }
}
