/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Asus
 */
public class Elektronic implements Payment {
    @Override
    public double calcTax(double price) {
        // Tax: 10%
        double tax = price * 0.1;
        return tax;
    }
}
