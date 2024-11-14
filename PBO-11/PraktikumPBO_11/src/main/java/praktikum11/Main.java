/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Create an Author
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("Mojang");
        
        // Create Books by this Author and add them to the Library
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1);
        Book book2 = new Book("How to Minecraft", author2);
        
        // Create a Library
        Library library = new Library();
        
        // Add Books to the Library
        library.addBook(book1);
        library.addBook(book2);
        
        // Display information about the Library, Books, and Author
        library.infoLibrary();
    }
}
