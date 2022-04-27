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
 * @author
 */
public class main {

    public static void main(String[] args) {
        int pilih;
        Scanner input = new Scanner(System.in);
        //Object Laptop
        Laptop Lptop = new Laptop("", "", "", 0, 0);
        ArrayList<Laptop> barang = new ArrayList<>();
        //Object Mouse
        Mouse mouse = new Mouse("", "", "", 0, 0);
        ArrayList<Mouse> barang1 = new ArrayList<>();
        //Object Keyword
        Keyboard KeyB = new Keyboard("", "", "", 0, 0);
        ArrayList<Keyboard> barang2 = new ArrayList<>();

        while (true) {
            System.out.println("\n\t\t Daftar Stok Aksesoris Komputer MSI");
            System.out.println("\t\t ----------------------------------");
            System.out.println("\n[1] Stok Laptop.");
            System.out.println("[2] Stok Mouse.");
            System.out.println("[3] Stok Keyboard.");
            System.out.println("[4] Keluar Aplikasi.");
            System.out.println("Masukan Pilihan : ");
            pilih = input.nextInt();
            if (pilih == 1) {
                System.out.println("\n\n\t\tDaftar Laptop");
                System.out.println("\t\t-------------");
                System.out.println("\n[1] Tambah Stok Laptop.");
                System.out.println("[2] Lihat Stok Laptop.");
                System.out.println("[3] Edit Stok Laptop.");
                System.out.println("[4] Hapus Stok Laptop.");
                System.out.println("[5] Kembali.");

                System.out.println("Masukan Pilihan (1/2/3/4/5) : ");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("Tambah data\n");
                        Lptop.tambahDataLaptop(barang);
                        Lptop.isiLaptop();
                        break;
                    case 2:
                        System.out.println("Lihat Data\n");
                        Lptop.lihatDataLaptop(barang);

                        break;
                    case 3:
                        System.out.println("Ubah Data\n");
                        Lptop.editDataLaptop(barang);
                        Lptop.editLaptop();
                        break;
                    case 4:
                        System.out.println("Hapus Data\n");
                        Lptop.hapusDataLaptop(barang);
                        Lptop.hapusLaptop();
                        break;
                    case 5:
                        System.out.println("Byebyee..");
                        break;
                    default:
                        System.out.println("Input Anda Salah!");
                        System.out.println("Silahkan Input data Kembali..");
                }
            } else if (pilih == 2) {
                System.out.println("\n\n\t\tDaftar Mouse");
                System.out.println("\t\t-------------");
                System.out.println("\n[1] Tambah Stok Mouse.");
                System.out.println("[2] Lihat Stok Mouse.");
                System.out.println("[3] Edit Stok Mouse.");
                System.out.println("[4] Hapus Stok Mouse.");
                System.out.println("[5] Kembali.");

                System.out.println("Masukan Pilihan (1/2/3/4/5) : ");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("\n\tTambah data\n");
                        mouse.tambahDataMouse(barang1);
                        mouse.isiMouse();
                        break;
                    case 2:
                        System.out.println("\n\tLihat Data\n");
                        mouse.lihatDataMouse(barang1);

                        break;
                    case 3:
                        System.out.println("\n\tUbah Data\n");
                        mouse.editDataMouse(barang1);
                        mouse.editMouse();
                        break;
                    case 4:
                        System.out.println("\n\tHapus Data\n");
                        mouse.hapusDataMouse(barang1);
                        mouse.hapusMouse();
                        break;
                    case 5:
                        System.out.println("Byebyee..");
                        break;
                    default:
                        System.out.println("Input Anda Salah!");
                        System.out.println("Silahkan Input data Kembali..");
                }
            } else if (pilih == 3) {
                System.out.println("\n\n\t\tDaftar Keyboard");
                System.out.println("\t\t-------------");
                System.out.println("\n[1] Tambah Stok Keyboard.");
                System.out.println("[2] Lihat Stok Keyboard.");
                System.out.println("[3] Edit Stok Keyboard.");
                System.out.println("[4] Hapus Stok Keyboard.");
                System.out.println("[5] Kembali.");

                System.out.println("Masukan Pilihan (1/2/3/4/5) : ");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("\n\tTambah data\n");
                        KeyB.tambahDataKeyboard(barang2);
                        KeyB.isiKeyboard();
                        break;
                    case 2:
                        System.out.println("\n\tLihat Data\n");
                        KeyB.lihatDataKeyboard(barang2);

                        break;
                    case 3:
                        System.out.println("\n\tUbah Data\n");
                        KeyB.editDataKeyboard(barang2);
                        KeyB.editKeyboard();
                        break;
                    case 4:
                        System.out.println("\n\tHapus Data\n");
                        KeyB.hapusDataKeyboard(barang2);
                        KeyB.hapusKeyboard();
                        break;
                    case 5:
                        System.out.println("Byebyee..");
                        break;
                    default:
                        System.out.println("Input Anda Salah!");
                        System.out.println("Silahkan Input data Kembali..");
                }
            }

        }

    }

}
