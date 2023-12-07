/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB1;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main (String[]args){
        //memuat objek
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Merk Kendaraan : " + mobil.merk);
        System.out.println("Jumlah Roda : " + mobil.jmlroda(4) + "\n");
        System.out.println("Cara kendaraan bergerak :  ");
        System.out.println("Saat maju : ");
        mobil.kendaraanMaju();
        System.out.println("Saat mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat berhenti : ");
        mobil.kendaraanBerhenti();
    }
}
