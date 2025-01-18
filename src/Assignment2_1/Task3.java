package Assignment2_1;
//Working with array elements
public class Task3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) array[i] = array[i] * (-1);
            System.out.println(array[i]);
        }
    }
}

