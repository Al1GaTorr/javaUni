package Assignment2_1;

import java.util.Arrays;

public class Task11 {
    public static int[][][][] MultiArray = new int[][][][]{{{{4, 8, 15}, {16}}, {{23, 42}, {}},
            {{1}, {2}, {3}, {4, 5}}}};
    public static void main(String[] args) {
    for(int[][][] row : MultiArray){
        System.out.println(Arrays.deepToString(MultiArray));
    }
    }
}
