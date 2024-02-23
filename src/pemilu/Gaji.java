/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemilu;

/**
 *
 * @author Fikri
 */

import pemilih.Pemilih;

public class Gaji {
    public static int transgaji = 1200000;
    public static int transtunjangan = 300000;

    public int gaji = 0;
    public int tunjangan = 0;
    //public int total = gaji+tunjangan;

    public Gaji(int gaji) {
        this.gaji = gaji;
        KPPS n = new KPPS();
        System.out.println("Jumlah gaji " + n.nama + ": " + gaji);
    }
    
    public void simpanTunjangan(int tunjangan) {  // method penyimpan tunjangan
        this.tunjangan = tunjangan;
    }

    public int bacaTunjangan() {             // method pengambil tunjangan
        return tunjangan;
    }
    
    public  int total(){
        return gaji+tunjangan;
    }
    
    public static int transtotal() {
        return transgaji + transtunjangan;
    }
    
    public static void cetakMumet() {
        Pemilih pemilih = new Pemilih("Fikri", "123220108");
        pemilih.sayaAslinyaMumet();
    }
    
}
