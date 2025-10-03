import java.util.Scanner;

public class LibraryManagementsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("Rich Dad Poor Dad", "Robert Kiyosaki"));

         while (true) {
            System.out.println("\n===== 📖 Library Menu =====");
            System.out.println("1. Show all books");
            System.out.println("2. Add new book");
            System.out.println("3. Issue a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("👉 Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(title, author));
                    break;
                case 3:
                    library.showBooks();
                    System.out.print("Enter book number to issue: ");
                    int issueIndex = sc.nextInt() - 1;
                    library.issueBook(issueIndex);
                    break;
                case 4:
                    library.showBooks();
                    System.out.print("Enter book number to return: ");
                    int returnIndex = sc.nextInt() - 1;
                    library.returnBook(returnIndex);
                    break;
                case 5:
                    System.out.println("👋 Exiting Library System. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }

        
    }
}