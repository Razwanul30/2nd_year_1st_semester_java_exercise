public class Practise4 {
    static void validateAge(int age) throws IllegalArgumentException {
        if (age <= 18) {
            throw new IllegalArgumentException("Age must be greater than 18");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
