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
public class ekspor extends pengiriman{
    private int nomor_kirim;
    private String tujuan_barang;
    
    public ekspor (pengiriman kirim,String nama_barang,int no_kirim, String ekspedisi, String status_kirim, double berat_barang, String tgl_kirim){
        super (no_kirim, nama_barang, ekspedisi, status_kirim, berat_barang, tgl_kirim);
        this.nomor_kirim = no_kirim;
        this.tujuan_barang = tujuan_barang;
    
    }
    public int getNomor_kirim() {
        return nomor_kirim;
    }

    public void setNomor_kirim(int nomor_kirim) {
        this.nomor_kirim = nomor_kirim;
    }

    public String getTujuan_barang() {
        return tujuan_barang;
    }

    public void setTujuan_barang(String tujuan_barang) {
        this.tujuan_barang = tujuan_barang;
    }
    
    public void tampilekspor(){
        super.tampil();
        System.out.println("PENGIRIMAN EKSPOR");
        System.out.println("nomor pengiriman : " +this.nomor_kirim);
        System.out.println("tujuan negara : " +this.tujuan_barang);
    }
    
    public void tambahekspor(){
        super.tambah();
    }
    public void editekspor(){
        super.edit();
    }
    public void hapusekspor(){
        super.hapus();
    }
}
