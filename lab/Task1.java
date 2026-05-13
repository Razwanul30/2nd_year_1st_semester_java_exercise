
class Box<T> {

    T item;

    void set(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");
        System.out.println(stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(42);
        System.out.println(integerBox.get());
    }
}