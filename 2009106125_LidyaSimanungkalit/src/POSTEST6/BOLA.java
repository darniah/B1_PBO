/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTEST6;



/**
 *
 * @author LENOVO
 */
public abstract class BOLA {
    protected   long no_punggung;
    protected  String nama;
    protected String posisi;
    protected final String team = "garuda";
   
    
    //abstract method punya cadangan
     public abstract void dtambah();
     public abstract void diubah();
//     public abstract void dihapus();
     
      public BOLA(long no_punggung,String nama,String posisi){
        this.no_punggung = no_punggung;
        this.nama = nama;
        this.posisi= posisi;
    }
     void dataDitambah(){
        System.out.println("BERHASIL MENAMBAHKAN DATA");
    }
    void dataDiubah(){
        System.out.println("BERHASIL MENGUBAH DATA");
    }
    void dataDihapus(){
        System.out.println("BERHASIL MENGHAPUS DATA");
    }
    
    void dataDihapus(String actor){
        System.out.println("BERHASIL MENGHAPUS DATA "+actor);
    }

    public long getNo_punggung() {
        return no_punggung;
    }

    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setNo_punggung(long no_punggung) {
        this.no_punggung = no_punggung;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

 
    
    
     
     
    
}
