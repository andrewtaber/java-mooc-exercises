
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test your program here
        Library Library = new Library();
        
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        Library.addBook(cheese);
        Book nhl = new Book("NHL Hokey", "Stanley Kupp", 1952);
        Library.addBook(nhl);
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairy Stupid Tales", "Penguin Group", 1992));
        
        ArrayList<Book> result = Library.searchByTitle("CHEESE");
        for(Book book : result) {
            System.out.println(book);
        }
        
        System.out.println("---");
        for(Book book : Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
        
        System.out.println("---");
        
        for(Book book : Library.searchByYear(1851)) {
            System.out.println(book);
        }
    }
}
