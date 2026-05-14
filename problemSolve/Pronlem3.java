interface Animal {
    void makeSound();
}

class Dog implements Animal {
   
    public void makeSound() {
        System.out.println("Bark");
    }
}

class cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}



public class Pronlem3 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new cat();

        dog.makeSound(); // Output: Bark
        cat.makeSound(); // Output: Meow
    }
}
