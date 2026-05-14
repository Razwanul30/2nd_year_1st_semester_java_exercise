interface Shape {
        double area();
    }

class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

public class Problem1 {
        public static void main(String[] args) {
                Shape s = new Circle(5); // Correct way to instantiate a Shape
                System.out.println(s.area());
            }
        }