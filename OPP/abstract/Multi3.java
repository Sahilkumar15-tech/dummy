public class Multi3 {
    public static void main(String[] args) {
        A a=new A();
        a.abstractX();a.abstractY();a.abstractZ();
    }
    
}
interface X{ public void abstractX();}
interface Y{ public void abstractY();}
interface Z{ public void abstractZ();}
class A implements X,Y,Z{
    A() { System.out.println("init A0");}
    public void abstractX()
    {System.out.println("Override  abstract x");}
    public void abstractY()
    {System.out.println("Override  abstract Y");}
    public void abstractZ()
    {System.out.println("Override  abstract Z");}
}