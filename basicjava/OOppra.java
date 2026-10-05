class OOp2{
    public static void main(String []args)
    {
        dog d1 =new dog();
         dog d3=new dog();
          dog d2 =new dog();
    }
}
class dog{
    private String bread , name;
    private int age;
    private boolean IsPet;


// setter
public void setBread(String bread){this.bread= bread;}
public void setName(String name){this.name= name;}
public void setAge(int age ){this.age=age;}
public void setIspet(boolean Ispet){this.IsPet=Ispet;}

// getter
public String getName