package Assignment2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        if (age >= 18 &&  age <= 28){
            System.out.println(name + " come to the military registration and enlistment office");
        }

    }
}
