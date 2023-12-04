package src.prodbuilder;

public class ClientMain {
    public static void main(String[] args) {
        Student.StudentBuilder b = Student.getBuilder();
        b.name = "Arun";
        b.age =101;

        Student.StudentBuilder b1 = Student.getBuilder();
        b1.name="Harish";
        b1.age=30;
        System.out.println("Debug");
    }
}
