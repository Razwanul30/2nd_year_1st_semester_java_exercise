public class Practise1 {
    public static void main(String[] args) {
        // int x =10/0;
        // System.out.println(x);
        // System.out.println("10/0");
        try {
            int x =10/0;
            System.out.println(x); 
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
