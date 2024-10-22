/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author Asus
 */
// Defining Abstract Class
abstract class Vehicle {
    // Abstract method
    abstract void moves();
    // Implemented method
    void info() {
        System.out. println("This is a vehicle.");
    }
}

// Derived classes of Vehicle
class Car extends Vehicle {
    @Override
    void moves() {
        System.out.println("The Car is moving quickly.");
    }
}

class Bike extends Vehicle {
    @Override
    void moves() {
         System.out.println("The Bike is moving slowly.");
    }
}