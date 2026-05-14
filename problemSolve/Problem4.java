interface Vihicle {
    void start();
}

class Car implements Vihicle {
    public void start() {
        System.out.println("Car is starting");
    }
}


public class Problem4 {
    public static void main(String[] args) {
        Vihicle car = new Car();
        car.start(); // Output: Car is starting
    }   
}
