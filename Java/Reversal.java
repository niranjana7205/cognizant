import java.util.*;
public class Reversal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String lower=a.toLowerCase();
        StringBuilder b=new StringBuilder();
        int n=a.length();
        for(int i=n-1;i>=0;i--)
        {
            b.append(lower.charAt(i));
        }
        String result=b.toString();
        System.out.println(result.substring(0,1).toUpperCase() + result.substring(1));
    }
}








