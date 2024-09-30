/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author Asus
 */
public class Produk_Main {
    public static void main(String[] args) {
        Elektronik elektronik = new Elektronik();
        elektronik.namaProduk = "Ponsel";
        elektronik.harga = 5000000;
        elektronik.garansi = 3;
        elektronik.tampilkanInfo();
        
        Makanan makanan = new Makanan();
        makanan.namaProduk = "Tahu";
        makanan.harga = 2000;
        makanan.tanggalKadaluarsa = "2024-10-10";
        makanan.tampilkanInfo();
    }
}
