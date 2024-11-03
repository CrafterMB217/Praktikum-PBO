/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Asus
 */
public class Main_Payment {
    public static void main(String[] args) {
        // Elektronics
        Payment Elektronic = new Elektronic();
        System.out.println("Electronics: $" + Elektronic.calcTax(700));
        
        // Foods
        Payment Food = new Food();
        System.out.println("Foods: $" + Food.calcTax(15));
    }
}
