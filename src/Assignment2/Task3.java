package Assignment2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double tempBody = input.nextDouble();
    boolean isHigh;
    boolean isLow;
    isLow = tempBody < 36.0;
    isHigh = tempBody > 37.0;
    if (isHigh) System.out.println("Your temperature of body is High");
    if (isLow) System.out.println("Your temperature of body is Low");
    if (!isHigh && !isLow) System.out.println("Your temperature of body is Normal");
}}


