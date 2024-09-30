/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ResponsiUTS;

/**
 *
 * @author Asus
 */
// Kelas Induk
public class Produk {
    String namaProduk;
    int harga;
    
    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Produk  : " + namaProduk);
        System.out.println("Harga Produk : Rp" + harga);
    }
}

// Kelas Turunan Elektronik
class Elektronik extends Produk {
    int garansi;
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi      : " + garansi + " tahun");
        System.out.println(); // spasi
    }
}

// Kelas Turunan Makanan
class Makanan extends Produk {
    String tanggalKadaluarsa;
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kadaluarsa   : " + tanggalKadaluarsa);
        System.out.println(); // spasi
    }
}