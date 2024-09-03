/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author Asus
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getmerk() {
        return merk;
    }
    public void setmerk(String merk) {
        this.merk = merk;
    }
    public String getmodel() {
        return model;
    }
    public void setmodel(String model) {
        this.model = model;
    }
    public int gettahun() {
        return tahun;
    }
    public void settahun(int tahun) {
        this.tahun = tahun;
    }
    public String getwarna() {
        return warna;
    }
    public void setwarna(String warna) {
        this.warna = warna;
    }
    void nilai() {
        System.out.println("Merk  : "+merk);
        System.out.println("Model : "+model);
        System.out.println("Tahun : "+tahun);
        System.out.println("Warna : "+warna);
    }
    void startEngine() {
        System.out.println("Engine: "+merk +" menyala abangku");
        System.out.println(" "/*spasi*/);
    }
}
