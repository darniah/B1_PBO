/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author D I D I
 */
public class Keyboard extends GudangMSI {

    Scanner input = new Scanner(System.in);
    String newNama;
    String newWarna;
    int newStok;
    int newHarga;

    //Constructor
    public Keyboard(String merk, String nama, String warna, int stok, int harga) {
        super(merk, nama, warna, stok, harga);
    }

    //Method
    @Override
    public void cabang() {
        System.out.println("\nData Keyboard Dari Distributor Pusat");
        System.out.println("----------------------------------------\n");
    }

    public void tambahDataKeyboard(ArrayList<Keyboard> barang) {

        System.out.println("\n");
        System.out.print("Nama Barang    : ");
        newNama = input.next();
        System.out.print("Warna Barang   : ");
        newWarna = input.next();
        System.out.print("Stok Barang    : ");
        newStok = input.nextInt();
        System.out.print("Harga Barang   : ");
        newHarga = input.nextInt();

        Keyboard keyboard = new Keyboard("", "", "", 0, 0);

        keyboard.setNama(newNama);
        keyboard.setWarna(newWarna);
        keyboard.setStok(newStok);
        keyboard.setHarga(newHarga);

        barang.add(keyboard);
        keyboard.tambahKeyboard();
    }

    public void lihatDataKeyboard(ArrayList<Keyboard> barang) {
        if (barang.isEmpty()) {
            System.out.println("Data Kosong");

        } else {
            Keyboard keyboard = new Keyboard("", "", "", 0, 0);

            keyboard.cabang();
            System.out.println("NO\tMerk Keyboard\t\tWarna\tHarga\tStok");
            System.out.println("===========================================================");

            for (int i = 0; i < barang.size(); i++) {
                System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i + 1, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

              
            }

        }
    }

    public void editDataKeyboard(ArrayList<Keyboard> barang) {
        Keyboard keyboard = new Keyboard("", "", "", 0, 0);

        keyboard.cabang();
        System.out.println("NO\tMerk Keyboard\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");

        for (int i = 0; i < barang.size(); i++) {
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

           
        }

        System.out.print("Masukkan Index Barang yang akan di Ubah !\n index : ");
        int pilih = input.nextInt();
        System.out.println("\tMasukkan DATA BARU");
        System.out.println("\t------------------");
        System.out.print("Merk Keyboard : ");
        newNama = input.next();
        System.out.print("Warna Keyboard : ");
        newWarna = input.next();
        System.out.print("Stok Keyboard : ");
        newStok = input.nextInt();
        System.out.print("Harga Keyboard : ");
        newHarga = input.nextInt();

        barang.get(pilih).setNama(newNama);
        barang.get(pilih).setWarna(newWarna);
        barang.get(pilih).setStok(newStok);
        barang.get(pilih).setHarga(newHarga);

        keyboard.editKeyboard();
    }

    public void hapusDataKeyboard(ArrayList<Keyboard> barang) {
        Keyboard keyboard = new Keyboard("", "", "", 0, 0);

        System.out.println("NO\tMerk Keyboard\t\tWarna\tHarga\tStok");
        System.out.println("===========================================================");

        for (int i = 0; i < barang.size(); i++) {
            System.out.println(String.format("[%d] %s\t\t\t%s\t%s\t%s", i, barang.get(i).getNama(), barang.get(i).getWarna(), barang.get(i).getStok(), barang.get(i).getHarga()));

            
        }
        System.out.print("Masukkan Index Barang yang akan di Ubah !\n index : ");
        int pilih = input.nextInt();
        barang.remove((int) Integer.valueOf(pilih));

        keyboard.hapusKeyboard();

    }

}
