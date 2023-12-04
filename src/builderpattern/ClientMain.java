package src.builderpattern;

public class ClientMain {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.name = "Arun";
        b.age =101;

        Student s = new Student(b);
        System.out.println("Debug");
    }
}
