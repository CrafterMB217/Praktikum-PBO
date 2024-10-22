/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Asus
 */
public class Animal_Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
    
        cat.sounds();
        cat.info();
    
        dog.sounds();
        dog.info();
    }
}
