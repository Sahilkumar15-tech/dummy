class Mystery{
    public static void main(String[] args) {
        int a=127;
        int b=127;
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
    }
}