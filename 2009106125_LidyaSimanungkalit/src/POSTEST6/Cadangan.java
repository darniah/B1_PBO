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
public class Cadangan  extends BOLA{
    private String kondisiCadangan;
    
    //contrukstor
    public Cadangan(long no_punggung, String nama, String posisi, String kondisiCadangan){
        super(no_punggung, nama, posisi);
        this.kondisiCadangan = kondisiCadangan;
    }
    

    @Override
    final public void dtambah() {
       System.out.println("BERHASIL MENAMBAHKAN DATA PEMAIN CADANGAN");
    }

    @Override
    final public void diubah() {
       System.out.println("BERHASIL MENGUBAH DATA PEMAIN CADANGAN");
    }

    //setter/getter
    public String getKondisiCadangan() {
        return kondisiCadangan;
    }

    public void setKondisiCadangan(String kondisiCadangan) {
        this.kondisiCadangan = kondisiCadangan;
    }


    
    
}
