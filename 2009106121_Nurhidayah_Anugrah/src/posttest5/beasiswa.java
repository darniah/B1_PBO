/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


/**
 *
 * @author MSi-Moderns
 */
public class beasiswa extends informasi {
    private String kategori;
    
    public beasiswa(informasi informasi, String kategori){
        super(informasi.getNamainfo(), informasi.getPenyelenggara(), informasi.getTanggal_pendaftaran(), informasi.getTanggal_penutupan());
        this.kategori = kategori;
    }
//    
//    public beasiswa(){
//        this.kategori = "";
//    }


    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    
}
