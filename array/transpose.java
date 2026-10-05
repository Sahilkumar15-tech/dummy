import java.util.*;
class Transpose{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        int r =sc.nextInt(),c =sc.nextInt();
        int[][]a = read(r,c);
        disp(a);
        int[][] t= transpose(a);
        disp(t);
    }
    static int[][] transpose(int[][]a){
        int[][] t= new int[a[0].length][a.length];
        for(int i = 0 ; i<t.length;i++)
            for(int j =0; j<t[i].length;j++){
        t[i][j]=a[j][]
        }

        return t;
    }
}