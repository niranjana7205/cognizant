import java.util.*;
public class Simple{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the arithmetic operation");

        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        switch(n){
            case 1:
                System.out.println("Sum "+ (a+b));
                break;
            case 2:
                System.out.println("Difference "+ (a-b));
                break;
            case 3:
                System.out.println("Multiply "+ (a*b));
                break;
            case 4:
                System.out.println("Divide "+ (a/b));
                break;
            default:
                System.out.println("Invalid option");

                
        }
    }
}