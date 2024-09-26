/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author Asus
 */

// Overloading
class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);       
    }
}

// Overriding
class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Miaw :3");
    }
}
class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Woof");
    }
}

// Main
public class Hewan_Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        Hewan kucing = new Kucing();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);
        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("daging", 3);
    }
}