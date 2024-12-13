package Assignment2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int temperature = input.nextInt();
    if (temperature < 0 ){
        System.out.println("It’s cold outside.");
    }
    else if (temperature >= 0) {
        System.out.println("It's warm outside");
    }
}
}
