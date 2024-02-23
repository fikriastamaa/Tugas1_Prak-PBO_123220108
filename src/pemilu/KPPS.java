/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemilu;

/**
 *
 * @author Fikri
 */

import pemilih.DPT;

public class KPPS {
    public static final boolean TERVERIFIKASI = true;
    
    public KPPS() {
        nama = "Fikri Astama Putra";
        email = "omjingaming@gmail.com";
        lokasi = "TPS 017";
        pengumuman = "Hasil Perhitungan presiden dan wakil presiden akan diumumkan petang nanti";
    }
    
    public String nama = "";
    public String email = "";
    public String lokasi;
    public static String pengumuman = "";
    
    public String getNama() {
        return nama;
    }
    
    public KPPS(String nama, String email) {
        this.nama += nama;
        this.email += email;
        this.lokasi += lokasi;
    }
    
    public void bekerja() {
        System.out.println("Anggota KPPS " + nama + " bertugas di " + lokasi + ".");
    }
    
    public void tampilkanPemilih(DPT dpt) {
        dpt.tampilkanTotalPemilih();
    }
    
    public static String pengumumanPresiden(){
        return pengumuman;
    }
} 

