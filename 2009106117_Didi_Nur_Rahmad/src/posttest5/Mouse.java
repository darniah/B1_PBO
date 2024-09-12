/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest5;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author D I D I
 */
public class Mouse extends GudangMSI {

    Scanner input = new Scanner(System.in);
    String newNama;
    String newWarna;
    int newStok;
    int newHarga;

    //Constructor
    public Mouse(String merk,String nama, String warna, int stok, int harga) {
        super(merk, nama, warna, stok, harga);

    }

    //Method
    @Override
    public void cabang() {
        System.out.println("\nData Mouse Dari Distributor Pusat");
        System.out.println("----------------------------------------\n");

    }

    public  void tambahDataMouse(ArrayList<Mouse> barang) {

        System.out.println("\n");
        System.out.print("Nama Barang    : ");
        newNama = input.next();
        System.out.print("Warna Barang   : ");
        newWarna = input.next();
        System.out.print("Stok Barang    : ");
        newStok = input.nextInt();
        System.out.print("Harga Barang   : ");
        newHarga = input.nextInt();

        Mouse mouse = new Mouse("","", "", 0, 0);

        mouse.setNama(newNama);
        mouse.setWarna(newWarna);
        mouse.setStok(newStok);
        mouse.setHarga(newHarga);

        barang.add(mouse);

    }

    public void lihatDataMouse(ArrayList<Mouse> barang) {
        if (barang.isEmpty()) {
            System.out.println("Data Kosong");

        } else {
            Mouse mouse = new Mouse("","", "", 0, 0);

            mouse.cabang();
            System.out.println("NO\tMerk Mouse\t\tWarna\tHarga\tStok");
            System.out.println("===========================================================");

            for (int i = 0; i < barang.size(); i++) {
                System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i + 1, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

                i++;
            }

        }
    }

    public void editDataMouse(ArrayList<Mouse> barang) {
        Mouse mouse = new Mouse("","", "", 0, 0);

        mouse.cabang();
        System.out.println("NO\tMerk Mouse\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");

        for (int i = 0; i < barang.size(); i++) {
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

            i++;
        }

        System.out.print("Masukkan Index Barang yang akan di Ubah !\n index : ");
        int pilih = input.nextInt();
        System.out.println("\tMasukkan DATA BARU");
        System.out.println("\t------------------");
        System.out.print("Merk Mouse : ");
        newNama = input.next();
        System.out.print("Warna Mouse : ");
        newWarna = input.next();
        System.out.print("Stok Mouse : ");
        newStok = input.nextInt();
        System.out.print("Harga Mouse : ");
        newHarga = input.nextInt();

        barang.get(pilih).setNama(newNama);
        barang.get(pilih).setWarna(newWarna);
        barang.get(pilih).setStok(newStok);
        barang.get(pilih).setHarga(newHarga);
    }

    public void hapusDataMouse(ArrayList<Mouse> barang) {
        System.out.println("NO\tMerk Mouse\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");

        for (int i = 0; i < barang.size(); i++) {
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

            i++;
        }
        System.out.print("Masukkan Index Barang yang akan di Ubah !\n index : ");
        int pilih = input.nextInt();
        barang.remove((int) Integer.valueOf(pilih));

    }

    void isiMouse() {
        System.out.println("Data Mouse berhasil di Input");
    }

    void editMouse() {
        System.out.println("Data Mouse berhasil di Ubah");
    }

    void hapusMouse() {
        System.out.println("Data Mouse berhasil di Hapus");
    }

}
