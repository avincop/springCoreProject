package InterfaceRefrence;

public class Simple {
     public Simple() {
    	 System.out.println("default constructor");
     }
     public Simple(Student s) {
    	 s.display();
    	 System.out.println("simple contsr");
     }
     public void show() {
    	 System.out.println("simple class method");
     }
}
