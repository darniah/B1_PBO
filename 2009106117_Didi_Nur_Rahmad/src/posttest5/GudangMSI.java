/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest5;

abstract class GudangMSI {

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
