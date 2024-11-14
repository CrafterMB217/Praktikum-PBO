/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Asus
 */
public class MainSC {
    public static void main(String[] args) {
        // Demonstrating Composition with Library and Book
        LibrarySC library = new LibrarySC();
        
        // Creating and adding books to the library
        BookSC book1 = new BookSC("The Pragmatic Programmer");
        BookSC book2 = new BookSC("Code Complete");
        BookSC book3 = new BookSC("Clean Code");
        
        library.addBookSC(book1);
        library.addBookSC(book2);
        library.addBookSC(book3);
        
        // Displaying library information
        System.out.println("Library Information:");
        library.infoLibrary();
        
        // Demonstrating Aggregation with Club and Member
        Club club = new Club("Tidar CompSci Club");
        
        // Creating and adding members to the club
        Member member1 = new Member("Fariz");
        Member member2 = new Member("Raymond");
        Member member3 = new Member("Armutri");
        
        club.addMember(member1);
        club.addMember(member2);
        club.addMember(member3);
        
        // Displaying club information
        System.out.println("\nClub Information:");
        club.infoClub();
    }
}
