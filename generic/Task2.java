import java.util.ArrayList;
import java.util.List;

class Repository<T> {
    private List<T> items = new ArrayList<>();
    public void add(T item) {
        items.add(item);
    }
    public T get(int index) {
        return items.get(index);
    }
    public List<T> getAll() {
        return new ArrayList<>(items);
    }
}

class User {
    int id;
    String name;
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return "Userid=" + id + ", name=" + name;
    }
}   


class Product {
    int id;
    String name;
    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return "Productid=" + id + ", name=" + name;
    }
}       

public class Task2 {
    public static void main(String[] args) {
        Repository<User> userRepository = new Repository<>();
        userRepository.add(new User(1, "Rahim"));
        userRepository.add(new User(2, "Karim"));

        System.out.println("Users:");
        for (User user : userRepository.getAll()) {
            System.out.println(user);
        }

        Repository<Product> productRepository = new Repository<>();
        productRepository.add(new Product(1, "Laptop"));
        productRepository.add(new Product(2, "Smartphone"));

        System.out.println("\nProducts:");
        for (Product product : productRepository.getAll()) {
            System.out.println(product);
        }
    }
}