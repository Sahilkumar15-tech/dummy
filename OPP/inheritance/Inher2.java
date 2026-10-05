package inheritance;
public class Inher2 {
    public static void main(String[] args) {
        
    }
}
class A{
    A() { System.out.println("Inside Constructor of A");}
    public void show(){System.out.println("Class A show");}
}
Class B extends A{
    B(){
        super();
        System.out.println("Inside Constructor of B");
    }
    public void show(){
        System.out.println("Class B Show");
        super.show();
    }
}
class C extends B{
    C(){
        super();
        System.out.println("T=Inside Constructor of C ");
    }
    public void show(){
        //overridding
        System.out.println("Class C show");
        super.show();
    }
}
    

