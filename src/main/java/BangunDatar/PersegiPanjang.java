/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Markas PMI Gorut
 */
public class PersegiPanjang extends BangunDatar implements Keliling, Simetri {
    // atribut
    public int panjang;
    public int lebar;
 
    // methods     
    @Override
    public double hitungLuas(){
        return this.panjang * this.lebar;
    } 
    @Override
    public double hitungKeliling(){
        return 2 * (this.lebar + this.panjang);
    }     
    @Override
    public double hitungSimPutar(){
        return 2.0;
    }     
    @Override
    public double hitungSimLipat(){
        return 2.0;
    }     
    @Override
    public void tampilHasil(){
        System.out.println("-------------------------------");
        System.out.println("Persegi Panjang");
        System.out.println("------------");
        System.out.println("Luasnya     : " + this.hitungLuas());
        System.out.println("Kelilingnya : " + this.hitungKeliling());
        System.out.println("Sim. Lipat  : " + this.hitungSimLipat());
        System.out.println("Sim. Putar  : " + this.hitungSimPutar());
        System.out.println("-------------------------------");
    }
     
}
