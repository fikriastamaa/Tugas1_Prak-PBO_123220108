/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemilih;

/**
 *
 * @author Fikri
 */

import pemilu.KPPS;

public class Pemilih {
    public String nama;
    public String nomorTPS;

    public Pemilih(String nama, String nomorTPS) {
        this.nama = nama;
        this.nomorTPS = nomorTPS;
    }

    public void memberikanSuara() {
        System.out.println("Pemilih " + nama + " memberikan suara di TPS nomor " + nomorTPS + ".");
    }
    
    public void memintaPengumuman() {
        String pengumuman = KPPS.pengumumanPresiden(); // Panggil metode langsung dari kelas KPPS
        System.out.println("Pengumuman: " + pengumuman);
    }
    
    public void sayaAslinyaMumet(){
        System.out.println("Alhamdulillah Puji Syukur kita panjatkan kepada Allah SWT atas karunianya sehingga semua classnya saling melengkapi seperti cintaku padanya aaaa asekk");
    }
}
