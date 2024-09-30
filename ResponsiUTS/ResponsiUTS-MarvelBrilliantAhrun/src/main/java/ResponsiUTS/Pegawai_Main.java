/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author Asus
 */
public class Pegawai_Main {
    public static void main(String[] args) {
        PegawaiTetap pegawai1 = new PegawaiTetap("Marvel", 7000000);
        pegawai1.tunjangan = 1000000;
        pegawai1.tampilkanInfo();
        
        PegawaiKontrak pegawai2 = new PegawaiKontrak("Dan Heng", 5000000);
        pegawai2.lamaKontrak = 10;
        pegawai2.tampilkanInfo();
    }
}
