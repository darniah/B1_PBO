/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest_6;

public final class SepedaGunung extends Sepeda {

    public SepedaGunung(int id,String merk, String noseri, String ukuransepeda, String warnasepeda, int jumlahroda, int harga) {
        super(id,merk, noseri, ukuransepeda, warnasepeda, jumlahroda, harga);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {

    }

    public String getNoseri() {
        return noseri;
    }

    public void setNoseri(String noseri) {
       
    }

    public String getUkuransepeda() {
        return ukuransepeda;
    }

    public void setUkuransepeda(String ukuransepeda) {
        
    }

    public String getWarnasepeda() {
        return warnasepeda;
    }

    public void setWarnasepeda(String warnasepeda) {
        
    }

    public int getJumlahroda() {
        return jumlahroda;
    }

    public void setJumlahroda(int jumlahroda) {
        
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {

    }
    
    final void TambahData()
    {
        System.out.println("ID Sepeda ini," + this.id +" sudah ditambahkan"); 
        System.out.println(" ");
    }
    final void UpdateData()
    {
        System.out.println("ID Sepeda ini," + this.id +" sudah diperbarui");
        System.out.println(" ");
    }
    final void HapusData()
    {
        System.out.println("ID Sepeda ini," + this.id +" sudah dihapus");
        System.out.println(" ");
    }
     
    void printNama() {
        System.out.println(" ");
        System.out.println("\tYola Cantik");
    }
    
    
}
