package Assignment2_1;

public class Task9 {
    public static void main(String[] args) {
        int[][] array = new int[10][];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11 ; j++) {
                array[i] = new int[j];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = i+j;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
        }


    }
}
