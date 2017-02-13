import	java.util.Scanner;

/**
 * Accept the entered expression from the console
 */
public class Getter {
    public String getSimbol() {
        Scanner	scanner = new Scanner(System.in);
        String s = scanner.next();
        return s;
    }    
}