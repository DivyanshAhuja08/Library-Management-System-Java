package college;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int roll_no;
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Student(Scanner sc) {
        System.out.println("Enter Student Name:");
        this.name = sc.nextLine();

        System.out.println("Enter Student Roll No:");
        this.roll_no = Integer.parseInt(sc.nextLine()); // safer than nextInt()
    }
}
