/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

import posttest5.*;

abstract class GudangMSI implements GetMessage {

    public final String merk = "==| MSI |==";
    private String nama;
    private String warna;
    private int stok;
    private int harga;

    GudangMSI(String merk, String nama, String warna, int stok, int harga) {

        this.nama = nama;
        this.warna = warna;
        this.stok = stok;
        this.harga = harga;
    }
//    implements method LaptopMessage
    @Override
    public void tambahLaptop(){
        System.out.println("Data Laptop berhasil di Tambah");
    }
    @Override
    public void editLaptop(){
        System.out.println("Data Laptop berhasil di Edit");
    }
    @Override
    public void hapusLaptop(){
        System.out.println("Data Laptop berhasil di Hapus");
    }
//    implements method MouseMessage

    @Override
    public void tambahMouse(){
        System.out.println("Data Mouse berhasil di Tambah");
    }
    @Override
    public void editMouse(){
        System.out.println("Data Mouse berhasil di Edit");
    }
    @Override
    public void hapusMouse(){
        System.out.println("Data Mouse berhasil di Hapus");
    }
//    implements method KeyboardMessage

    @Override
    public void tambahKeyboard(){
        System.out.println("Data Keyboard berhasil di Tambah");
    }
    @Override
    public void editKeyboard(){
        System.out.println("Data Keyboard berhasil di Edit");
    }
    @Override
    public void hapusKeyboard(){
        System.out.println("Data Keyboard berhasil di Hapus");
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    abstract void cabang();

}
