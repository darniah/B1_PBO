package Posttest5_Darniah;
import Posttest5_Darniah.KebunBinatang;

abstract public class KebunBinatang {
    protected String Nama_Hewan;
    protected String Jenis_Hewan;
    protected String Habitat_Hewan;
    protected int Jumlah_Hewan;
    
    
    public KebunBinatang(String Nama_Hewan, String Jenis_Hewan, String Habitat_Hewan, int Jumlah_Hewan ){
        this.Nama_Hewan = Nama_Hewan;
        this.Jenis_Hewan = Jenis_Hewan ;
        this.Habitat_Hewan = Habitat_Hewan;
        this.Jumlah_Hewan = Jumlah_Hewan;
        
    }

    public String getNama_Hewan() {
        return Nama_Hewan;
    }

    public void setNama_Hewan(String Nama_Hewan) {
        this.Nama_Hewan = Nama_Hewan;
    }

    public String getJenis_Hewan() {
        return Jenis_Hewan;
    }

    public void setJenis_Hewan(String Jenis_Hewan) {
        this.Jenis_Hewan = Jenis_Hewan;
    }

    public String getHabitat_Hewan() {
        return Habitat_Hewan;
    }

    public void setHabitat_Hewan(String Habitat_Hewan) {
        this.Habitat_Hewan = Habitat_Hewan;
    }

    public int getJumlah_Hewan() {
        return Jumlah_Hewan;
    }

    public void setJumlah_Hewan(int Jumlah_Hewan) {
        this.Jumlah_Hewan = Jumlah_Hewan;
    }   
    public void berhasiltambahData(){
        System.out.println("Data berhasil ditambahkan");
    }
    public void berhasileditData(){
        System.out.println("Data berhasil diedit");
    }
    public void berhasilhapusData(){
        System.out.println("Data Berhasil diHapus");
    }
}




