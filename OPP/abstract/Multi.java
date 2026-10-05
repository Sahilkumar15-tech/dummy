class Multi2{
    public static void main(String[]stdy){
        Z z = new Z();

        
    }
}

abstract class X{
    X(){System.out.println("Init abstract X");}
    //abstract public void abstractMethod();
    public void concrete(){
        System.out.println("In concreate in abract X");
    }
}

interface Y{
    public void abstractY();
}

interface Z{
    public void abstractZ();
    public void abstractX();
}

class A extends Z implements Y,Z {
    A()
    {System.out.println("init concrete A");}
    public void abstractMethod()
    {System.out.println("overeloading abstract method");}
    public void abstractY()
    {System.out.println("overeloading abstractY");}
    public void abstractZ()
    {System.out.println("overeloading abstractZ");}
    
}