/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_123220108;

/**
 *
 * @author Fikri
 */

import pemilu.Gaji;
import pemilu.KPPS;
import pemilih.Pemilih;
import pemilih.DPT;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=====================================");
        System.out.println("=========== PETUGAS KPPS ============");
        System.out.println("=====================================");
        
        pemilu.KPPS petugas = new pemilu.KPPS();
        System.out.println("Nama : " + petugas.nama);
        System.out.println("Email : " + petugas.email);
        
        System.out.println("=====================================");
        System.out.println("Apakah - " + petugas.email + " - sudah terverifikasi? " + KPPS.TERVERIFIKASI);
        System.out.println("=====================================");
        
        Gaji gajinya = new Gaji(1200000);
        
        gajinya.simpanTunjangan(300000);
        
        System.out.println("Tunjangan: " + gajinya.bacaTunjangan());
        
        System.out.println("=====================================");
        System.out.println("Total semuanya :" +gajinya.total());
        System.out.println("=====================================");

        // Memanggil method untuk menampilkan tugas anggota KPPS
        petugas.bekerja();

        // Membuat objek Pemilih
        pemilih.Pemilih rakyat = new pemilih.Pemilih("LEK BOKIR", "017");

        // Memanggil method untuk menampilkan aktivitas pemilih
        rakyat.memberikanSuara();
        
        System.out.println("=====================================");
        
        // Membuat objek DPT
        DPT pemilih = new DPT("LEK BOKIR");
        
        // Memanggil method untuk mengecek suara
        pemilih.cekSuara();
        
        System.out.println("=====================================");
        
        petugas.tampilkanPemilih(pemilih);
        rakyat.memintaPengumuman();
        pemilih.memintaTransparansiGaji();
        Gaji.cetakMumet();
    }
}