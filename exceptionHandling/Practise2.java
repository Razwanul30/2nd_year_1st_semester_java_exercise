
public interface Practise2 {

    public static void main(String[] args) {
        String name = null;
        // int a = 10/0;
        try {
            System.out.println(name.length());
            // System.out.println(a);
        }   catch (NullPointerException e) {
            System.out.println("This is null pointer exception");
        }   catch (Exception e) {
            System.out.println("go away");
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
