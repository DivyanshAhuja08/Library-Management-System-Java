package college;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students students = new Students();
        Books books = new Books();

        while (true) {
            System.out.println("\nWarm Welcome");
            System.out.println("Please Choose any one:");
            System.out.println("1. Register Student");
            System.out.println("2. See all registered Students");
            System.out.println("3. Show all Books");
            System.out.println("4. Search a Book by ISBN");
            System.out.println("5. Add new Book");
            System.out.println("6. Upgrade the Quantity of a Book");
            System.out.println("7. Check out Book");
            System.out.println("8. Check in Book");
            System.out.println("9. Exit ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    students.add_Student(new Student(sc));
                    break;
                case 2:
                    students.Show_all_Student();
                    break;
                case 3:
                    books.show_all_book();
                    break;
                case 4:
                    books.find_book();
                    break;
                case 5:
                    books.add_book(new Book(sc));
                    break;
                case 6:
                    books.upgrade_qty();
                    break;
                case 7:
                    students.check_out_book(books);
                    break;
                case 8:
                    students.check_in_book(books);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
