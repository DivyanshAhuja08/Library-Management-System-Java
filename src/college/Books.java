package college;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    static ArrayList<Book> Books = new ArrayList<>();
    public static int count=0;
    Scanner sc = new Scanner(System.in);

    public int compare_books(Book b1, Book b2) {
        if (b1.BookName.equalsIgnoreCase(b2.BookName)) {
            System.out.println("Book of this Name Already Exists");
            return 0;
        }
        if (b1.BookISBN.equalsIgnoreCase(b2.BookISBN)) {
            System.out.println("Book of this ISBN Already Exists");
            return 0;
        }
        return 1;
    }

    public void add_book(Book b) {
        for (Book book : Books) {
            if (compare_books(b, book) == 0) {
                return;
            }
        }
        if (count < 50) {
            Books.add(b);
            count++;
        } else {
            System.out.println("No more space to add book");
        }
    }

    public void search_by_isbn_number() {
        System.out.println("Enter Book ISBN Number:");
        String isbn = sc.next();
        for (Book book : Books) {
            if (book.BookISBN.equalsIgnoreCase(isbn)) {
                System.out.println(book.BookName);
                System.out.println(book.BookAuthor);
                System.out.println(book.BookISBN);
                System.out.println(book.Book_qty);
                System.out.println(book.Book_available);
                return;
            }
        }
        System.out.println("No such a Book exists of ISBN number:" + isbn);
    }

    public void search_by_author_name() {
        System.out.println("Enter Book Author:");
        String author = sc.next();
        for (Book book : Books) {
            if (book.BookAuthor.equalsIgnoreCase(author)) {
                System.out.println(book.BookName);
                System.out.println(book.BookAuthor);
                System.out.println(book.BookISBN);
                System.out.println(book.Book_qty);
                System.out.println(book.Book_available);
                return;
            }
        }
        System.out.println("No such a Book exists of Author:" + author);
    }

    public void show_all_book() {
        for (Book book : Books) {
            System.out.println(book.BookName);
            System.out.println(book.BookAuthor);
            System.out.println(book.BookISBN);
            System.out.println(book.Book_qty);
            System.out.println(book.Book_available);
        }
    }

    public Book find_book() {
        System.out.println("Enter Book ISBN Number:");
        String isbn = sc.next();
        for (Book book : Books) {
            if (book.BookISBN.equalsIgnoreCase(isbn)) {
                return book;
            }
        }
        System.out.println("Book Not Found of isbn:" + isbn);
        return null;
    }

    public void upgrade_qty() {
        Book b = find_book();
        if (b == null) return;
        System.out.println("Enter the Number of new Book want to add:");
        int add_qyt = sc.nextInt();
        b.Book_available += add_qyt;
        b.Book_qty += add_qyt;
        System.out.println("Book Quantity Successfully Updated");
    }

    public void checkin() {
        Book b = find_book();
        if (b == null) return;
        b.Book_available++;
        System.out.println("Book Successfully Checked In:");
    }

    public Book checkout() {
        Book b = find_book();
        if (b == null) return null;
        if (b.Book_available > 0) {
            b.Book_available--;
            return b;
        }
        System.out.println("Book Not Available");
        return null;
    }

    public void available() {
        Book b = find_book();
        if (b == null) return;
        if (b.Book_available == 0) {
            System.out.println("Book Not Available");
        } else {
            System.out.println("Book Available");
        }
    }
}
