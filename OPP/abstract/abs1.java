public class abs1{
    public static void main(String[] args) {
        System.out.println("Done");
        
    }
}
abstract class X{
    X(){System.out.println("abs class X");}
    abstract public void abstractMethod();
    public void concreteMethod()
    {System.out.println("concrete");}
}
class Y extends X {
    public void abstractMethod(){}
}