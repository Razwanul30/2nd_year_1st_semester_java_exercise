public class Practise3 {
    public static void main(String[] args) {
        int age = 10;
        if (age <= 18) {
            throw new IllegalArgumentException("Age must be greater than 18");
    }
        System.out.println("Age is valid: " + age);
    }
}
