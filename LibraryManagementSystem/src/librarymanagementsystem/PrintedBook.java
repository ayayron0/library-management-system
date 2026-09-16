package librarymanagementsystem;

/**
 *
 * @author aaron
 */
public class PrintedBook extends Book {
private int pages;

public PrintedBook(String title, String author, String isbn, int pages) {
    super(title, author, isbn);
    this.pages = pages;
}

public int getPages() {
    return pages;
}

@Override
public String toString() {
    return super.toString() + " | Pages: " + pages;
}

}

