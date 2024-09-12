/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

/**
 *
 * @author RIRI-CHAN
 */
public class impor extends pengiriman{
    private int nom_kirim;
    private String asal_barang;
    
    public impor(pengiriman kirim,String nama_barang,int no_kirim, String ekspedisi, String status_kirim, double berat_barang, String tgl_kirim){
         super (no_kirim, nama_barang, ekspedisi, status_kirim, berat_barang, tgl_kirim);
         this.nom_kirim = nom_kirim;
         this.asal_barang = asal_barang;
    }

    public int getNom_kirim() {
        return nom_kirim;
    }

    public void setNom_kirim(int nom_kirim) {
        this.nom_kirim = nom_kirim;
    }

    public String getAsal_barang() {
        return asal_barang;
    }

    public void setAsal_barang(String asal_barang) {
        this.asal_barang = asal_barang;
    }
    
    public void tampilimpor(){
        super.tampil();
        System.out.println("Nomor pengiriman : " +this.nom_kirim);
        System.out.println("Barang Berasal dari : " +this.asal_barang);
    }
    
    public void tambahimpor(){
        super.tambah();
    }
    public void editimpor(){
        super.edit();
    }
    public void hapusimpor(){
        super.hapus();
    }

}
