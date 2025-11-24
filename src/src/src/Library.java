import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        System.out.println("\n--- Available Books ---");
        for (Book b : books) {
            b.displayBook();
        }
        System.out.println();
    }

    public void searchBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                System.out.println("\nBook Found:");
                b.displayBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                if (b.isIssued()) {
                    System.out.println("Book is already issued!");
                } else {
                    b.issueBook();
                    System.out.println("Book issued successfully!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getBookId() == id) {
                if (!b.isIssued()) {
                    System.out.println("Book is not issued!");
                } else {
                    b.returnBook();
                    System.out.println("Book returned successfully!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
