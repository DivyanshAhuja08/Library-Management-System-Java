package college;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Students {
    ArrayList<Student> students = new ArrayList<>();
    public static int count = 0;
    private final Scanner sc = new Scanner(System.in);

    public boolean compare_student(Student s1, Student s2) {
        return s1.roll_no == s2.roll_no;
    }

    public void add_Student(Student s1) {
        for (Student s : students) {
            if (compare_student(s1, s)) {
                System.out.println("Student already exists");
                return;
            }
        }
        students.add(s1);
        count++;
    }

    public void Search_student() {
        System.out.println("Enter Student Roll no:");
        int roll_no = sc.nextInt();
        for (Student s : students) {
            if (s.roll_no == roll_no) {
                System.out.println(s.name);
                System.out.println(s.roll_no);
                return;
            }
        }
        System.out.println("Student not exists");
    }

    public Student get_Student() {
        System.out.println("Enter Student Roll no:");
        int roll_no = sc.nextInt();
        for (Student s : students) {
            if (s.roll_no == roll_no) {
                return s;
            }
        }
        System.out.println("Student not exists");
        return null;
    }

    public void Show_all_Student() {
        for (Student s : students) {
            System.out.println(s.name);
            System.out.println(s.roll_no);
        }
    }

    public void check_out_book(Books b) {
        Student s = get_Student();
        if (s == null) return;

        Book d = b.checkout();
        if (d != null) {
            System.out.println("Checked out Book");
            s.books.add(d);
        } else {
            System.out.println("Book Not Available");
        }
    }

    public void check_in_book(Books b) {
        Student s = get_Student();
        if (s == null) return;

        for (Book a : s.books) {
            System.out.println(a.BookName);
            System.out.println(a.BookAuthor);
            System.out.println(a.BookISBN);
        }

        System.out.println("Enter the ISBN Number:");
        String isbn = sc.next();

        Iterator<Book> itr = s.books.iterator();
        while (itr.hasNext()) {
            Book a = itr.next();
            if (a.BookISBN.equalsIgnoreCase(isbn)) {
                itr.remove();
                b.checkin();
                System.out.println("Book Checked In");
                return;
            }
        }
        System.out.println("Wrong ISBN number");
    }
}
