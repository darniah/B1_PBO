/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSSTEST5;

public abstract class Karyawan {
    protected String nama;
    protected String alamat;
    protected int tahunLahir;
    protected int tahunMasuk;
    
    public Karyawan(String nama, String alamat, int tahunLahir, int tahunMasuk){
        this.nama = nama;
        this.alamat = alamat;
        this.tahunLahir = tahunLahir;
        this.tahunMasuk = tahunMasuk;
    }
    void display(){
        System.out.println("Nama Karyawan       : "+ this.nama);
        System.out.println("alamat              : "+ this.alamat);
        System.out.println("tahunLahir          : "+ this.tahunLahir);
        System.out.println("tahunMasuk          : "+ this.tahunMasuk);
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public abstract void DataMasuk();
    public abstract void DataKeluar();
}
