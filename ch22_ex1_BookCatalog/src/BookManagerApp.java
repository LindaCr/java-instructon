import java.util.ArrayList;
import java.util.List;

public class BookManagerApp {

    public static void main(String[] args) {
        BookManager manager = new BookManager();
       
        List<Book> booksByTitle = manager.getBooks(
                b -> b.getTitle().contains("Java"));
        System.out.println("\nBOOKS BY TITLE:");
        printList(booksByTitle);
        System.out.println();
        
        List<Book> booksByCategory = manager.getBooks(
                b -> b.getCategory().equals(Book.JAVA));
        System.out.println("\nBOOKS BY CATEGORY:");
        printList(booksByCategory);
        System.out.println();
        
        List<Book> booksByFormat = manager.getBooks(
                b -> b.getFormat().equals(Book.PAPERBACK));
        System.out.println("\nBOOKS BY FORMAT:");
        printList(booksByFormat);
        System.out.println();
    }
    
    public static void printList(List<Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}