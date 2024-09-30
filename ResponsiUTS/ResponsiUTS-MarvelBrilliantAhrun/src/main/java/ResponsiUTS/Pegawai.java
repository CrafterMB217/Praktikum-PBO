/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author Asus
 */
// Kelas Induk
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    // Constructor
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter dan Setter namaPegawai
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    // Getter dan Setter gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Metode tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Gaji         : Rp" + gaji);
    }
}

// Kelas Turunan PegawaiTetap
class PegawaiTetap extends Pegawai {
    double tunjangan;

    public PegawaiTetap(String namaPegawai, double gaji) {
        super(namaPegawai, gaji);
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan    : Rp" + tunjangan);
        System.out.println(); // spasi
    }
}

// Kelas Turunan PegawaiKontrak
class PegawaiKontrak extends Pegawai {
    int lamaKontrak;
    
    public PegawaiKontrak(String namaPegawai, double gaji) {
        super(namaPegawai, gaji);
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak : " + lamaKontrak + " bulan");
        System.out.println(); // spasi
    }
}