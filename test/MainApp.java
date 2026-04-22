interface A {
    default void show () {
        System.out.println("Interface A");
    }
}

interface B {
    default void show () {
        System.out.println("Interface B");
    }
}   

class C implements A, B {
    @Override 
    public void show () {
        System.out.println("Class C");
    }
}

public class MainApp {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}