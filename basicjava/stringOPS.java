/*import java.util.* ;
class StringOps{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        for(int i=0; i<s.length();i++){
            System.out.println(s.charAt(i));


        }
        
    }
}
*/
import java.util.* ;
class StringOps{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        String r ="";
        for(int i=s.length()-1;i>-1;i++){

            r+=s.charAt(i);
        }
        System.out.println("given" + s+ "\n REv:"+r);
        System.out.println("Using built in :" +s.reverse());
    }
}
