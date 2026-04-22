interface Shape {
        double area();
    }

public class Prob {
        public static void main(String[] args) {
                Shape s = new Shape(); // BUG
                System.out.println(s.area());
            }
        }