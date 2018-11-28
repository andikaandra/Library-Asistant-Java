package library.assistant;

/**
 *
 * @author Bosmo
 */
public class BookControl {
    public void editBook(Book book){};
    public void deleteBook(Book book){};
    public static void AddBook(int buku, String judul, String penulis, String penerbit){
        Book.addBook(buku, judul, penulis, penerbit);
    };
    public void checkBook(int idBook){};
    public void bookList(){};
}
