import java.util.*;
public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder b = new StringBuilder();

        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        
        if (a.equals(b.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

















