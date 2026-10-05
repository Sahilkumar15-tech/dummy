package unit2;

public class sealed {
    
     C obj = new C();

        obj.showA();
        obj.showB();
        obj.showC();
}
class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

final class C extends B {
    void showC() {
        System.out.println("Class C");
    }
}

    

