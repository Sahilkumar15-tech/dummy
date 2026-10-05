import java.util.*;
class Factorial{
    public static void main (String [] aaa)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n  = sc.nextInt();
        System.out.println(n   + "!=" +  fact(n));

    }
    static int fact(int n){
        int f=1;
        for(int i = 1; i<=n ;i++)
        f *=i;
        return f;
    }
}