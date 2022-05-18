
package Posttest6_Darniah;

public class Binatang extends KebunBinatang{
    private String Warna;
    
    public Binatang(String Nama_Hewan, String Jenis_Hewan, String Habitat_Hewan, int Jumlah_Hewan, String Warna) {
        super(Nama_Hewan, Jenis_Hewan, Habitat_Hewan, Jumlah_Hewan);
        this.Warna = Warna;
    }
    void display(){
        System.out.println("Nama_Hewan:"+ this.Nama_Hewan);
        System.out.println("Jenis_Hewan:"+ this.Jenis_Hewan);
        System.out.println("Habitat_Hewan:"+ this.Habitat_Hewan);
        System.out.println("Jumlah_Hewan:"+ this.Jumlah_Hewan);
    }

 
    public void setWarna(String Warna){
        this.Warna= Warna;
    }
    
    public String getWarna(){
        return Warna;
    }
    final public void berhasiltambahData(){
        System.out.println("Data berhasil ditambahkan didalam data Binatang");
    }
    final public void berhasildihapusData(){
        System.out.println("Data berhasil dihapus didalam data Binatang");
    }
    final public void berhasileditData(){
        System.out.println("Data berhasil diedit didalam data Binatang");
    }

}
