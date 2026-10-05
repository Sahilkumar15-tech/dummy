class  BoxingDemo{
    public static void main(String[] args) {
        Object x=5.0;
        System.out.println(x.getClass().getName());
        char c='5';
        Object y= c;
        System.out.println(y.getClass().getName()); 
        int a =5;
        Integer b=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

    }
}