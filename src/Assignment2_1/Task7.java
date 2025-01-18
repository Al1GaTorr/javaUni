package Assignment2_1;

import java.util.Scanner;

//Delete identical strings
public class Task7 {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = input.next();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])){
                    strings[i] = "null";
                    strings[j] = "null";
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");

        }
    }
}