/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Asus
 */
// Overloading
class Produk {
    public void nama() {
        System.out.println("Nama produk");
    }
    public void  harga(String namaproduk, int harga) {
        System.out.println("Produk " + namaproduk + " memiliki harga Rp" + harga);
    }
    public void hitungDiskon() {
        System.out.println("Diskon produk");
    }
}

//// Overriding (Kelas Turunan)
// Buku
class Buku extends Produk {
    @Override
    public void nama() {
        System.out.println("Buku Chemistry");
    }
    @Override
    public void hitungDiskon() {
        int harga = 10000;
        double diskon = 0.40 * harga;  // Diskon 40%
        System.out.println("Diskon Buku Chemistry: Rp" + diskon);
        System.out.println("Harga setelah diskon: Rp" + (harga - diskon));
        System.out.println(""); // Spasi
    }
}
// Elektronik
class Elektronik extends Produk {
    @Override
    public void nama() {
        System.out.println("Elektronik Ponsel");
    }
    @Override
    public void hitungDiskon() {
        int harga = 1000000;
        double diskon = 0.10 * harga;  // Diskon 10%
        System.out.println("Diskon Elektronik Ponsel: Rp" + diskon);
        System.out.println("Harga setelah diskon: Rp" + (harga - diskon));
        System.out.println(""); // Spasi
    }
}
// Pakaian
class Pakaian extends Produk {
    @Override
    public void nama() {
        System.out.println("Pakaian Baju");
    }
    @Override
    public void hitungDiskon() {
        int harga = 80000;
        double diskon = 0.15 * harga;  // Diskon 15%
        System.out.println("Diskon Pakaian Baju: Rp" + diskon);
        System.out.println("Harga setelah diskon: Rp" + (harga - diskon));
        System.out.println(""); // Spasi
    }
}

// Overriding (KeranjangBelanja)
class KeranjangBelanja {
    
}

// Main
public class Produk_Main {
    public static void main(String[] args) {
        
        Produk buku = new Buku();
        buku.nama();
        buku.harga("Chemistry", 10000);
        buku.hitungDiskon();
        
        Produk elektronik = new Elektronik();
        elektronik.nama();
        elektronik.harga("Ponsel", 1000000);
        elektronik.hitungDiskon();
        
        Produk pakaian = new Pakaian();
        pakaian.nama();
        pakaian.harga("Baju", 80000);
        pakaian.hitungDiskon();
    }
}