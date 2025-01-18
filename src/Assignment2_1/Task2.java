package Assignment2_1;
//Even or odd cells of the array
public class Task2 {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];
    public static void main(String[] args) {
    for (int i = 0; i < 5; i++){
        if (i % 2 == 0) strings[i] = ODD;
        else strings[i] = EVEN;
        System.out.println(strings[i]);
        }
    }
}


