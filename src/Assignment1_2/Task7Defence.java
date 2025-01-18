package Assignment1_2;

public class Task7Defence {
        public static void main(String[] args) {
            int row = 20;
            int i = 1;
            while (i <= row) {
                int probel = row - i;
                int j = 1;
                while (probel > 0) {
                    System.out.print(" ");
                    probel--;
                }
                while (j <= i) {
                    System.out.print("Q");
                    j++;
                }
                i++;
                System.out.println();
            }
            i = row - 1;
            while (i > 0) {
                int probel = row - i;
                int j = 1;
                while (probel > 0) {
                    System.out.print(" ");
                    probel--;
                }
                while (j <= i) {
                    System.out.print("Q");
                    j++;
                }
                i--;
                System.out.println();
            }
        }
    }
