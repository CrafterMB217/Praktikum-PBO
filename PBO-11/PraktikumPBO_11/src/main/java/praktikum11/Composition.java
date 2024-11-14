/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
class Book {
    private String title;
    private Author author; // aggregation relationship with Author

    public Book (String title, Author author) {
        this.title = title;
        this.author = author; // constructor to initialize the Author
    }
    
    public void infoBook() {
        System.out.println("Book Title: "+ title);
        author.infoAuthor(); // Calls infoAuthor() of the Author object
    }
}

class Library {
    private List<Book> bookList;
    
    public Library() {
        this.bookList = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        bookList.add(book);
    }
    
    public void infoLibrary() {
        for (Book book : bookList) {
            book.infoBook();
        }
    }
}