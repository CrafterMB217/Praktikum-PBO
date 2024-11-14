/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package praktikum11;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
class BookSC {
    private String title;
    
    public BookSC (String title) {
        this.title = title;
    }
    
    public void infoBook() {
        System.out.println("Book Title: " + title);
    }
}

class LibrarySC {
    private List<BookSC> bookList;
    
    public LibrarySC() {
        this.bookList = new ArrayList<>();
    }
    
    public void addBookSC(BookSC book) {
        bookList.add(book);
    }
    
    public void infoLibrary() {
        for (BookSC book : bookList) {
            book.infoBook();
        }
    }
}
