import java.util.*;
class SumOfArray{
    public static void main (String[] args)
    {
        int[] arr = new int [100];
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for( int i =0 ; i<n ; i++)
        arr[i] =sc.nextInt();
        System.out.println("sum");
        int s=0;
        for( int i =0 ; i<n ; i++)
        s+=arr[i];
        System.out.println("sum",s);
    }
}