import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        Student student = new Student(id, name, age);

        System.out.println("\n--- Student Details ---");
        student.display();

        sc.close();
    }
}

