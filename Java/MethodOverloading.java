import java.util.*;
public class MethodOverloading {
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static double add(double d1,double d2)
    {
        return d1+d2;
    }
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d1=(double) a;
        double d2=(double) b;

        int twoo=add(a,b);
        double too=add(d1,d2);
        int threee=add(a,b,c);

        System.out.println("Addition of two Integer : "+twoo);
        System.out.println("Addition of two Double : "+too);
        System.out.println("Addition of three Integer : "+threee);
    }
}