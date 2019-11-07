/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan50.energi;

/**
 *
 * @author User
 */
public class energikinetik {
    private double massa,kecepatan;
    private final double kecepatan1 = 0; 
     private double hasil,usaha;

    energikinetik(double massa, double kecepatan) {
        this.massa=massa;
        this.kecepatan=kecepatan;
        
    }

    public double getUsaha() {
        return usaha = 1*massa*((kecepatan*kecepatan)-(kecepatan1*kecepatan1))/2;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getHasil() {
        return hasil=0.5*massa*kecepatan*kecepatan;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    
    
public void tampil(){
    System.out.println("energi kinetik yang di hasilkan: "+getHasil());
    System.out.println("usaha : "+getUsaha());
}
    
    
}
