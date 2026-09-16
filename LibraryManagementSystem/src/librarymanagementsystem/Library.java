package librarymanagementsystem;
import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author aaron
 */
public class Library implements LibraryOperations {
    private ArrayList<Book> books = new ArrayList<>();

@Override
public boolean addBook(Book book) {
    return books.add(book);
}

@Override
public boolean removeBook(Book book) {
    return books.remove(book);
}

@Override
public String retrieveAllBooks() {
    if (books.isEmpty()) {
    return "No books available";
}   
    StringBuilder sb = new StringBuilder();
    for (Book b : books) {
    sb.append(b.toString()).append("\n");
}
    return sb.toString();
}

@Override
public String retrieveBookByAuthor(String author) {
    StringBuilder sb = new StringBuilder();
    for (Book b : books) {
    if (b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
         sb.append(b.toString()).append("\n");
}
}
    if (sb.length() == 0) {
        return "No books found by author: " + author;
}
        return sb.toString();
}


@Override
public String retrieveBookByTitle(String title) {
    StringBuilder sb = new StringBuilder();
    for (Book b : books) {
    if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
       sb.append(b.toString()).append("\n");
}
}
    if (sb.length() == 0) {
       return "No books found with title: " + title;
}
        return sb.toString();
}

public boolean saveBooks() {
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.ser"))) {
    oos.writeObject(books);
    return true;
} catch (Exception e) {
    return false;
}
}


public boolean loadBooks() {
try (ObjectInputStream ois =
    new ObjectInputStream(new FileInputStream("books.ser"))) {
    books = (ArrayList<Book>) ois.readObject();
    return true;
} catch (Exception e) {
    return false;
}
}

public boolean saveBooksToCSV() {
try (PrintWriter writer = new PrintWriter(new FileWriter("books.csv"))) {
    for (Book b : books) {
    String line = b.getTitle() + "," + b.getAuthor() + "," + b.getIsbn()   + "," + (b instanceof PrintedBook
    ? "PrintedBook," +((PrintedBook) b).getPages():"eBook," +((eBook) b).getFileSize());
    writer.println(line);
}
    return true;
} catch (Exception e) {
    return false;
}
}

public Book[] getBooks() {
   return books.toArray(new Book[0]);
}


}

