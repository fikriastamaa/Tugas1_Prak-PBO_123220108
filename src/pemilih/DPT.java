/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemilih;

/**
 *
 * @author Fikri
 */

import pemilu.Gaji;

public class DPT {
    pemilu.KPPS PETUGAS = new pemilu.KPPS();
    
    public String namaPemilih;

    public DPT(String namaPemilih) {
        this.namaPemilih = namaPemilih;
    }

    public void cekSuara() {
        System.out.println("Suara " + namaPemilih + " Telah dicek oleh petugas " + PETUGAS.getNama());
    }
    
    public void tampilkanTotalPemilih(){
        System.out.println("Total Pemilih pada TPS 017 sebanyak 224");
    }
    
    public void memintaTransparansiGaji(){
        int totalGaji = Gaji.transtotal(); // Panggil metode total dari kelas Gaji tanpa membuat objek
        System.out.println("pemilih menanyakan gaji petugas KPPS, dijawablah gajinya sebesar " + totalGaji);
    }
    
}
