/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme Produk
        Produk produk1 = new Elektronik();
        produk1.namaProduk = "Ponsel";
        produk1.harga = 5000000;
        ((Elektronik) produk1).garansi = 3;
        produk1.tampilkanInfo();
        
        Produk produk2 = new Makanan();
        produk2.namaProduk = "Tahu";
        produk2.harga = 2000;
        ((Makanan) produk2).tanggalKadaluarsa = "2024-10-10";
        produk2.tampilkanInfo();
        
        // Polimorfisme Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Marvel", 7000000);
        ((PegawaiTetap) pegawai1).tunjangan = 1000000;
        pegawai1.tampilkanInfo();
        
        Pegawai pegawai2 = new PegawaiKontrak("Dan Heng", 5000000);
        ((PegawaiKontrak) pegawai2).lamaKontrak = 10;
        pegawai2.tampilkanInfo();
    }
}

