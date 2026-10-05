 import java.util.*;
// class Array{
//     public static void main(String [] args){
//         int[] a = new int[100];
//         System.out.println("Size")
//     }
// }
class TwoDArray{
    public static void main(String[]args){
        // int[][]a ={ {1,2},{3,4}};
        /*for(int i=0;i < a.length; i++){
           for(int j=0;j < a[i].length;j++){
             System.out.print(a[i][j] + "\t");
            
           }
           System.out.println("enchaned for :");
           for(int[] inner:a){
            for(int item:inner){
                System.out.print(item+"\t");

            }
            System.out.pri
           }
        }*/

       //accept user-input 2 d matrix, display
       Scanner sc=new Scanner(System.in);
       System.out.println("Rows:");
       int r= sc.nextInt();
       System.out.println("Columns:");
       int c =sc.nextInt();
       int[][] a = new int [r][c];
       System.out.println("item:");
       for(int i=0;i<a.length; i++){
        for(int j=0; j<a[i].length;j++){
            a[i][j]=sc.nextInt();

        }
       }
       System.out.println("input:");
       for(int i=0;i<a.length; i++){
        for(int j=0; j<a[i].length;j++){
         System.out.print(a[i][j]+"\t");
          }
        System.out.println();

         }


    }
}