package Assignment1_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        while(true){
            num = input.nextInt();
            sum += num;
            if (input.hasNext("ENTER"))break;

        }
        System.out.println(sum);
    }
}
