/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Asus
 */
public class Food implements Payment {
    @Override
    public double calcTax(double price) {
        // Tax: 5%
        double tax = price * 0.05;
        return tax;
    }
}
