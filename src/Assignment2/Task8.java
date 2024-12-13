package Assignment2;

public class Task8 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
