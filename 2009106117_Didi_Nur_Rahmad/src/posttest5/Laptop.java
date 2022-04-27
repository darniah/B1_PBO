/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author D I D I
 */
public class Laptop extends GudangMSI {

    Scanner input = new Scanner(System.in);
    String newNama;
    String newWarna;
    int newStok;
    int newHarga;

    //Constructor
    Laptop(String merk,String nama, String warna, int stok, int harga) {
        super(merk,nama, warna, stok, harga);
    }
    
    // implementasi Method Abstract dari parent class "GudangMSI"
    @Override
    public void cabang() {
        System.out.println("\nData Laptop Dari Distributor Pusat");
        System.out.println("----------------------------------------\n");
    }

    public void tambahDataLaptop(ArrayList<Laptop> barang) {

        System.out.println("\n");
        System.out.print("Nama Barang    : ");
        newNama = input.next();
        System.out.print("Warna Barang   : ");
        newWarna = input.next();
        System.out.print("Stok Barang    : ");
        newStok = input.nextInt();
        System.out.print("Harga Barang   : ");
        newHarga = input.nextInt();

        Laptop lptop = new Laptop("","", "", 0, 0);

        lptop.setNama(newNama);
        lptop.setWarna(newWarna);
        lptop.setStok(newStok);
        lptop.setHarga(newHarga);

        barang.add(lptop);

    }

    public void lihatDataLaptop(ArrayList<Laptop> barang) {
        if (barang.isEmpty()) {
            System.out.println("Data Kosong");

        } else {
            Laptop lptop = new Laptop("","", "", 0, 0);

            lptop.cabang();
            System.out.println("NO\tMerk Laptop\t\tWarna\tHarga\tStok");
            System.out.println("===========================================================");

            for (int i = 0; i < barang.size(); i++) {
                System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i + 1, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

                i++;
            }

        }
    }

    public void editDataLaptop(ArrayList<Laptop> barang) {
        Laptop lptop = new Laptop("","", "", 0, 0);

        lptop.cabang();
        System.out.println("NO\tMerk Laptop\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");

        for (int i = 0; i < barang.size(); i++) {
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

            i++;
        }

        System.out.print("Masukkan Index Barang yang akan di Ubah !\n index : ");
        int pilih = input.nextInt();
        System.out.println("\tMasukkan DATA BARU");
        System.out.println("\t------------------");
        System.out.print("Merk Laptop : ");
        newNama = input.next();
        System.out.print("Warna Laptop : ");
        newWarna = input.next();
        System.out.print("Stok Laptop : ");
        newStok = input.nextInt();
        System.out.print("Harga Laptop : ");
        newHarga = input.nextInt();

        barang.get(pilih).setNama(newNama);
        barang.get(pilih).setWarna(newWarna);
        barang.get(pilih).setStok(newStok);
        barang.get(pilih).setHarga(newHarga);
    }

    public void hapusDataLaptop(ArrayList<Laptop> barang) {
        System.out.println("NO\tMerk Laptop\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");

        for (int i = 0; i < barang.size(); i++) {
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

            i++;
        }
        System.out.print("Masukkan Index Barang yang akan di Ubah !\n index : ");
        int pilih = input.nextInt();
        barang.remove((int) Integer.valueOf(pilih));

    }

    //Method
    void isiLaptop() {
        System.out.println("Data Laptop berhasil di Input");
    }

    void editLaptop() {
        System.out.println("Data Laptop berhasil di Ubah");
    }

    void hapusLaptop() {
        System.out.println("Data Laptop berhasil di Hapus");
    }

}
