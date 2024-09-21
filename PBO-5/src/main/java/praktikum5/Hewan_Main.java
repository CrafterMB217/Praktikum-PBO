/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Asus
 */
// Kelas induk hewan
class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

// Kelas turunan Kucing
class Kucing extends Hewan {
    String suara;
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara : " + suara);
        System.out.println(""); // spasi
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    String suara;
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara : " + suara);
        System.out.println(""); // spasi
    }
}

// Main
public class Hewan_Main {
    public static void main (String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Mochi";
        kucing.jenis = "Ragdoll";
        kucing.suara = "Miaw :3";
        kucing.tampilkanInfo();
    
        Anjing anjing = new Anjing();
        anjing.nama = "Kyow";
        anjing.jenis = "Samoyed";
        anjing.suara = "Woof";
        anjing.tampilkanInfo();
    }
}