/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pekerja dan menginisialisasi dengan nama, usia, pekerjaan, dan gaji
        Pekerja pekerja1 = new Pekerja("Liben", 27, "Pedagang Keliling", 300000);

        // Menampilkan informasi pekerja dengan menggunakan metode toString()
        System.out.println(pekerja1.toString());
    }
}
