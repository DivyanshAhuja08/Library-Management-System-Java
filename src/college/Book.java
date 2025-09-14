package college;

import java.util.Scanner;

public class Book {
    public String BookName;
    public String BookAuthor;
    public String BookISBN;
    public int Book_qty;
    public int Book_available;

    public Book(Scanner sc) {
        System.out.println("Enter Book Name:");
        this.BookName = sc.nextLine();

        System.out.println("Enter Book Author:");
        this.BookAuthor = sc.nextLine();

        System.out.println("Enter Book ISBN:");
        this.BookISBN = sc.nextLine();

        System.out.println("Enter Book Quantity:");
        this.Book_qty = Integer.parseInt(sc.nextLine()); // safer than nextInt()
        this.Book_available = this.Book_qty;
    }
}
