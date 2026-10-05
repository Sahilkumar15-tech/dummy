import java.utlil.*;
class Add2Arr{
    static Scanner sc = new Scanner(System.in)
    public Static void main(String[] args){
        
        int r=sc.nextInt(),c=sc.nextInt();
        int[][]a =read(r,c),b=read(r,c);
        disp(a);
        disp(b);
        int[][] res =add(a,b);
        disp(res);
    }
    static int[][] read(int r, int c){
        int[][] a = new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] =
                return a;
            }
        }
    }
    static int[][] add(int[][] a, int[][]b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0; i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                res[i][j]=a[i][j]+b[i][j];

            }
        }
        return res;
    } 
    static void disp(int[][] a){


    }
}

