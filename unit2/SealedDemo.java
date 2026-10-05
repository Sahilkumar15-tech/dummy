/*package unit2;

// The main class name must match the filename (e.g., SealedDemo.java)
public class SealedDemo { 
    public static void main(String[] args) { 
        Student s = new Student(); 
        UGStudent u = new UGStudent(); 
        PGStudent p = new PGStudent(); 
    } 
}

// 1. Removed parentheses from 'permits'
// 2. Changed permitted names to match the actual class names exactly
sealed class Student permits UGStudent, PGStudent, DiplomaStudent { 
    Student() { 
        System.out.println("Student Class sealed");
    } 
}

// 3. Added 'non-sealed' modifier to all subclasses
non-sealed class UGStudent extends Student { 
    UGStudent() { 
        System.out.println("UG Student");
    } 
}

non-sealed class PGStudent extends Student { 
    PGStudent() { 
        System.out.println("pG Student");
    } 
}

non-sealed class DiplomaStudent extends Student { 
    DiplomaStudent() { 
        System.out.println("Diploma Student");
    } 
}
*/

class SealedDemo {
    public static void main(String[] args) {
      C c=new C();
      c.showC();
      c.showB();
      c.showA();
    }
}

sealed class A permits B, C {
    A() {
        System.out.println("Class A");
    }

    public void showA() {
        System.out.println("Show A");
    }
}

final class B extends A {
    B() {
        System.out.println("Class B");
    }

    public void showB() {
        System.out.println("Show B");
    }

}

non-sealed class C extends A {
    C() {
       System.out.println("Class C");
    }

    public void showB() {
        System.out.println("Show C");
    }

}