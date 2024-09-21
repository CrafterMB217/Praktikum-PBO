/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author Asus
 */
// Kelas induk Kendaraan
class Kendaraan {
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Kelas menengah KendaraanDarat
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Kelas turunan Mobil
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println(""); // spasi
    }
}

// Kelas turunan SepedaMotor
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println(""); // spasi
    }
}

public class Kendaraan_Main {
    public static void main (String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Nissan";
        mobil.jumlahRoda = 4;
        mobil.kecepatan = 250;
        mobil.jumlahPintu = 2;
        mobil.tampilkanInfo();
    
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.jumlahRoda = 2;
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
    }
}