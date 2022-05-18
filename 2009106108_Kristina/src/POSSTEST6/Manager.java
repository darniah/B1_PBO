package POSSTEST6;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager implements Karyawan {

    private String Alamat;
    private int TahunMasuk;
  
    public Manager(String Alamat, int TahunMasuk) {
        this.Alamat = Alamat;
        this.TahunMasuk = TahunMasuk;
    }


    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(int TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }

    @Override
    public void nama() {
        System.out.println("Joko");
    }

    @Override
    public void tahunLahir() {
        System.out.println("1998"); 
    }

    @Override
    public void bagian() {
        System.out.println("Keuangan");
    }

    @Override
    public void tunjanganJabatan() {
        System.out.println("2000000");
    }

    @Override
    public void tunjanganGolongan() {
        System.out.println("50000");
    }

    @Override
    public void gaji() {
        System.out.println("5000000");
    }

  
}