package praktikum6b;

import java.util.ArrayList;
import java.util.List;

// Overloading
class Produk {
    protected String namaproduk;
    protected int harga;

    public Produk(String namaproduk, int harga) {
        this.namaproduk = namaproduk;
        this.harga = harga;
    }

    public void nama() {
        System.out.println("Nama produk");
    }

    public void harga() {
        System.out.println("Produk " + namaproduk + " memiliki harga Rp" + harga);
    }

    public double hitungDiskon() {
        return 0; // Default tanpa diskon
    }

    public double hargaSetelahDiskon() {
        return harga - hitungDiskon(); // Harga setelah diskon
    }
}

// Overriding (Kelas Turunan)
class Buku extends Produk {
    public Buku(String namaproduk, int harga) {
        super(namaproduk, harga);
    }

    @Override
    public void nama() {
        System.out.println("Buku: " + namaproduk);
    }

    @Override
    public double hitungDiskon() {
        return 0.10 * harga; // Diskon 10%
    }
}

class Elektronik extends Produk {
    public Elektronik(String namaproduk, int harga) {
        super(namaproduk, harga);
    }

    @Override
    public void nama() {
        System.out.println("Elektronik: " + namaproduk);
    }

    @Override
    public double hitungDiskon() {
        return 0.15 * harga; // Diskon 15%
    }
}

class Pakaian extends Produk {
    public Pakaian(String namaproduk, int harga) {
        super(namaproduk, harga);
    }

    @Override
    public void nama() {
        System.out.println("Pakaian: " + namaproduk);
    }

    @Override
    public double hitungDiskon() {
        return 0.20 * harga; // Diskon 20%
    }
}

// Kelas KeranjangBelanja
class KeranjangBelanja {
    private List<Produk> keranjang;

    public KeranjangBelanja() {
        keranjang = new ArrayList<>();
    }

    // Menambahkan produk ke dalam keranjang
    public void tambahProduk(Produk produk) {
        keranjang.add(produk);
    }

    // Menghitung total harga setelah diskon dari semua produk di keranjang
    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : keranjang) {
            total += produk.hargaSetelahDiskon();
        }
        return total;
    }

    // Menampilkan detail semua produk di keranjang
    public void tampilkanProduk() {
        for (Produk produk : keranjang) {
            produk.nama();
            produk.harga();
            System.out.println("Diskon: Rp" + produk.hitungDiskon());
            System.out.println("Harga setelah diskon: Rp" + produk.hargaSetelahDiskon());
            System.out.println(); // Spasi antar produk
        }
    }
}

// Main
public class Produk_Main_KeranjangBelanja {
    public static void main(String[] args) {
        // Membuat beberapa produk
        Produk buku = new Buku("Chemistry", 10000);
        Produk elektronik = new Elektronik("Ponsel", 1000000);
        Produk pakaian = new Pakaian("Baju", 80000);

        // Membuat keranjang belanja dan menambahkan produk
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        // Menampilkan semua produk di keranjang
        keranjang.tampilkanProduk();

        // Menghitung total harga setelah diskon
        double totalHargaSetelahDiskon = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: Rp" + totalHargaSetelahDiskon);
    }
}
