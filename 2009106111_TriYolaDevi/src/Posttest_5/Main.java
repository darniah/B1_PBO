/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest_5;

import java.util.Scanner;
import java.io.IOException;


public class Main {
    public static void main(String[] args)throws IOException {
         PanggilSepeda yola = new PanggilSepeda();
        
    Scanner inputdata = new Scanner (System.in);
    int coba = 1;
    while(coba==1){
        System.out.println("------------------------------");
        System.out.println("  SELAMAT DATANG DI PROGRAM   ");
        System.out.println("         DATA SEPEDA          ");
        System.out.println("------------------------------");
        System.out.println("                              ");
        System.out.println("||========== MENU ==========||");
        System.out.println("||1.Tambah Data Sepeda      ||");
        System.out.println("||2.Lihat Data Sepeda       ||");
        System.out.println("||3.Ubah Data Sepeda        ||");
        System.out.println("||4.Hapus Data Sepeda       ||");
        System.out.println("||5.Exit                    ||");
        System.out.println("||==========================||");
        int pilihan;
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = inputdata.nextInt();
        if (pilihan == 1){
                yola.pilih();
                int x = inputdata.nextInt();
                if (x == 1){
                    yola.tambahDataSepedaBalap();
                }
                else if (x == 2){
                    yola.tambahDataSepedaGunung();
                }
                System.out.println("Data Berhasil Di Tambahkan!!");
                System.out.println(" ");
        }
        else if (pilihan == 2){
                yola.pilih();
                int x = inputdata.nextInt();
                if (x == 1){
                    yola.lihatDataSepedaBalap();
                }
                else if (x == 2){
                    yola.lihatDataSepedaGunung();
                }
                System.out.println(" ");
        }
        else if (pilihan == 3){
                yola.pilih();
                int x = inputdata.nextInt();
                if (x == 1){
                    yola.ubahDataSepedaBalap();
                }
                else if (x == 2){
                    yola.ubahDataSepedaGunung();
                }
                System.out.println("Data Berhasil Di Ubah!!");
                System.out.println(" ");
        }
        else if (pilihan == 4){  
                yola.pilih();
                int x = inputdata.nextInt();
                if (x == 1){
                    yola.hapusDataSepedaBalap();
                }
                else if (x == 2){
                    yola.hapusDataSepedaGunung();
                }
                System.out.println("Data Berhasil Di Hapus!!");
                System.out.println(" ");   
        } 
         else if (pilihan == 5){ 
                System.out.println("DAH BYE BYE");
                System.exit(1);}
        }
    }
}
