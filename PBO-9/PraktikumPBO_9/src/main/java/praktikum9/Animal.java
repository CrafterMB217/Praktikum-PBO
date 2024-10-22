/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Asus
 */
// Abstract Class
abstract class Animal {
    abstract void sounds();
    void info() {
        System.out. println("This is an animal.");
    }
}

// Derived Classes
class Cat extends Animal {
    @Override
    void sounds() {
        System.out.println("Meow :3");
    }
}
class Dog extends Animal {
    @Override
    void sounds() {
         System.out.println("Woof :p");
    }
}