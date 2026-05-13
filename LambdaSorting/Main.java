import java.util.*;

class Student {
    String name;
    int age;
    double cgpa;

    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    public String toString() {
        return name + " | age=" + age + " | cgpa=" + cgpa;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Rizwan", 22, 3.5));
        list.add(new Student("Araf", 20, 3.9));
        list.add(new Student("Naim", 21, 3.2));

        //  Age ascending
        list.sort((a, b) -> a.age - b.age);
        System.out.println("Sort by Age:");
        list.forEach(System.out::println);

        System.out.println("-------------");

        //  CGPA descending
        list.sort((a, b) -> Double.compare(b.cgpa, a.cgpa));
        System.out.println("Sort by CGPA:");
        list.forEach(System.out::println);

        System.out.println("-------------");

        //  Name ascending
        list.sort((a, b) -> a.name.compareTo(b.name));
        System.out.println("Sort by Name:");
        list.forEach(System.out::println);

        System.out.println("-------------");

        //  Multiple sort (age -> cgpa)
        list.sort(
            Comparator.comparing((Student s) -> s.age)
                      .thenComparing(s -> s.cgpa)
        );
        System.out.println("Sort by Age then CGPA:");
        list.forEach(System.out::println);
    }
}