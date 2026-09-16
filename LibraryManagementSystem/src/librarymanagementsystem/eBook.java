package librarymanagementsystem;

/**
 *
 * @author aaron
 */
public class eBook extends Book {
private double fileSize;

public eBook(String title, String author, String isbn, double fileSize) {
    super(title, author, isbn);
    this.fileSize = fileSize;
}

public double getFileSize() {
    return fileSize;
}

@Override
public String toString() {
    return super.toString() +
    " | File Size: " + fileSize + "MB";
}

}

