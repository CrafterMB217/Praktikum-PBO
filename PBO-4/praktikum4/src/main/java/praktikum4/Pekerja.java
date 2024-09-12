/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Asus
 */
public class Pekerja {
    private String nama;
    private int usia;
    private String pekerjaan;
    private double gaji;

    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk atribut usia
    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Getter dan Setter untuk atribut pekerjaan
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Metode untuk menampilkan informasi pekerja
    public void tampilkanInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("Usia     : " + usia);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji     : " + gaji);
    }
    
    // Override metode toString untuk menampilkan semua informasi pekerja
    @Override
    public String toString() {
        return "Nama     : " + nama + 
               "\nUsia     : " + usia + 
               "\nPekerjaan: " + pekerjaan + 
               "\nGaji     : " + gaji;
    }
}
