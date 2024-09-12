/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;


/**
 *
 * @author MSi-GAMING
 */
abstract public class Kickkers { // agar class ini tidak bisa dijadikan objek
    protected final String Artikel; // keyword Final untuk mencegah variabel ini di ubah
    protected final String Warna; // keyword Final untuk mencegah variabel ini di ubah
    protected final String Harga; // keyword Final untuk mencegah variabel ini di ubah
    protected final int Total_brg; // keyword Final untuk mencegah variabel ini di ubah
    
//    public Kickkers(String Artikel, String Warna, String Harga, int Total_brg){
//        this.Artikel = Artikel;
//        this.Warna = Warna;
//        this.Harga = Harga;
//        this.Total_brg = Total_brg;
//    }
    
    public Kickkers(){
        this.Artikel = "";
        this.Warna = "";
        this.Harga = "";
        this.Total_brg = 0;
    }
    
    void tambahData(){
        System.out.println("Data Berhasil Ditambahkan di Kickkers !");
    }
    
    void ubahData(){
        System.out.println("Data Berhasil Diubah di Kickkers !");
    }
    
    void hapusData(){
        System.out.println("Data Berhasil Dihapus di Kickkers !");
    }
    
    protected void lihatData(){
        System.out.println("Lihat Data Berhasil di Kickkers !");
    }

    protected abstract String getArtikel();
    protected abstract void setArtikel(String Artikel);
    protected abstract String getWarna();
    protected abstract void setWarna(String Warna);
    protected abstract String getHarga();
    protected abstract void setHarga(String Harga);
    protected abstract int getTotal_brg();
    protected abstract void setTotal_brg(int Total_brg);
}
