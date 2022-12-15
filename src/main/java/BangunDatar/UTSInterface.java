/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Markas PMI Gorut
 */
public class UTSInterface {
   public static void main(String[] args) {
 
        // hitung luas, keliling, dan simetri dari suatu lingkaran A dg r=14 satuan
        Lingkaran A = new Lingkaran();
        A.jejari = 14;
        A.tampilHasil();
 
        // hitung luas, keliling, dan simetri dari suatu persegi panjang B dg panjang=10 & lebar=5 satuan
        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 10;
        B.lebar = 5;
        B.tampilHasil();
 
        // hitung luas dari segitiga C dg alas=12 & tinggi=8 satuan
        Segitiga C = new Segitiga();
        C.alas = 12;
        C.tinggi = 8;
        C.tampilHasil();
    }
}
