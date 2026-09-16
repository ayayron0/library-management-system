package librarymanagementsystem;

/**
 *
 * @author aaron
 */
public interface LibraryOperations {
boolean addBook(Book book);
boolean removeBook(Book book);
String retrieveAllBooks();
String retrieveBookByAuthor(String author);
String retrieveBookByTitle(String title);
}
