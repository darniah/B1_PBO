/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

//abstract class

import posttest5.*;
//abstract class

public abstract class informasi implements interfacecsi{
    public String namainfo;
    private String penyelenggara;
    private String tanggal_pendaftaran;
    private String tanggal_penutupan;
    private boolean tahun;
    
    public informasi(String namainfo, String penyelenggara, String tanggal_pendaftaran, String tanggal_penutupan){
     this.namainfo = namainfo;
     this.penyelenggara = penyelenggara;
     this.tanggal_pendaftaran = tanggal_pendaftaran;
     this.tanggal_penutupan = tanggal_penutupan;
    }

    public String getNamainfo() {
        return namainfo;
    }
    
    public void waktu(){
        tahun = true;
        System.out.println("Tahun" + tahun + "\nInformasi beasiswa dan lomba tersebut masih berlaku");
    }
    
    public void berlaku(){
        System.out.println("");
    }

    public void setNamainfo(String namainfo) {
        this.namainfo = namainfo;
    }

    public String getPenyelenggara() {
        return penyelenggara;
    }

    public void setPenyelenggara(String penyelenggara) {
        this.penyelenggara = penyelenggara;
    }

    public String getTanggal_pendaftaran() {
        return tanggal_pendaftaran;
    }

    public void setTanggal_pendaftaran(String tanggal_pendaftaran) {
        this.tanggal_pendaftaran = tanggal_pendaftaran;
    }

    public String getTanggal_penutupan() {
        return tanggal_penutupan;
    }

    public void setTanggal_penutupan(String tanggal_penutupan) {
        this.tanggal_penutupan = tanggal_penutupan;
    }

    
}

