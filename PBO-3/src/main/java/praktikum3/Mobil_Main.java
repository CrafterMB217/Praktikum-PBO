/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Asus
 */
public class Mobil_Main {
    public static void main(String[] args) {
        Mobil Marvel= new Mobil("Mazda", "RX-7 FD3S", 2002, "Putih");
        Marvel.nilai();
        Marvel.startEngine();
        Mobil Dwiki= new Mobil("Porsche", "Carrera GT", 2004, "Silver");
        Dwiki.nilai();
        Dwiki.startEngine();
    }
}
