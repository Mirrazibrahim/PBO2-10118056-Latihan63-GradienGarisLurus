/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan63.gradiengarislurus;

/**
 *
 * @author 
 * NAMA : MIrraz Ibrahim
 * KELAS : IF-2
 * NIM : 10118056
 */
public class Tester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    Koordinat krd = new Koordinat(2,10,5,7);
    Koordinat krd2 = new Koordinat(5,1,3,12);
    
        System.out.println("Garis yang melalui titik (" +krd.getX1()+","+krd.getY1()+") dan ("+krd.getX2()+ ","+krd.getY2() + ") memiliki gradien sebesar " +krd.hitungGradien());
        System.out.println("Garis yang melalui titik (" +krd2.getX1()+","+krd2.getY1()+") dan ("+krd2.getX2()+ ","+krd2.getY2() + ") memiliki gradien sebesar "+krd2.hitungGradien());
    }
}
