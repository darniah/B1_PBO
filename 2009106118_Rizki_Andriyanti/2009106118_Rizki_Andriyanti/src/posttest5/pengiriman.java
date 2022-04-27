/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest5;

/**
 *
 * @author RIRI-CHAN
 */
public abstract class pengiriman {
    public final int no_kirim;
    public final String nama_barang;
    public final String ekspedisi;
    public final String status_kirim;
    public final Double berat_barang;
    public final String tgl_kirim;
    
    public pengiriman(int no_kirim,String nama_barang, String ekspedisi, String status_kirim, double berat_barang, String tgl_kirim){
        this.no_kirim = no_kirim;
        this.nama_barang = nama_barang;
        this.ekspedisi = ekspedisi;
        this.status_kirim = status_kirim;
        this.berat_barang = berat_barang;
        this.tgl_kirim = tgl_kirim;
    }
    
    public pengiriman(){
        this.no_kirim = 12345;
        this.nama_barang= "Tas Luxury";
        this.ekspedisi = "JNT";
        this.status_kirim = "EKSPOR";
        this.berat_barang = 1.0;
        this.tgl_kirim = "12 Januari 2021";
    }
    
    public int getNo_kirim() {
        return no_kirim;
    }

    public void setNo_kirim(int no_kirim) {
        
    }
    
    public String getEkspedisi() {
        return ekspedisi;
    }

    public void setEkspedisi(String ekspedisi) {
        
    }

    public String getStatus_kirim() {
        return status_kirim;
    }

    public void setStatus_kirim(String status_kirim) {
       
    }

    public Double getBerat_barang() {
        return berat_barang;
    }

    public void setBerat_barang(Double berat_barang) {
        
    }

    public String getTgl_kirim() {
        return tgl_kirim;
    }

    public void setTgl_kirim(String tgl_kirim) {
        
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
       
    }
    void tampil(){
        System.out.println("Tampil Data..............");
    }
    void tambah(){
         System.out.println("Penambahan Selesai..............");
     }
    void edit(){
         System.out.println("Pengeditan Selesai..............");
     }
    void hapus(){
         System.out.println("Penghapusan Selesai..............");
     }
}
