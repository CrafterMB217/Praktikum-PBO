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
class  Author {
    private String nameAuthor;
    
    public Author(String nameAuthor) {
        this.nameAuthor= nameAuthor;
    }
    
    public void infoAuthor() {
        System.out.println("Author's Name: " + nameAuthor);
    }
}
