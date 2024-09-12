/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

/**
 *
 * @author RIRI-CHAN
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static posttest6.main.input;

class databarang implements identitasBarang {
    ArrayList dataBarang = new ArrayList ();
    static boolean isRunning = true;
    static boolean isEditing = false;
    
    public void lihatBarang() throws IOException{
        if(dataBarang.isEmpty()){
            System.out.println("Data Kosong");
            kembali();
        } else {
            for(int i = 0; i < dataBarang.size(); i++){
                System.out.println("No\tKode\t\tNama Tas\tBrand\t\tStatus\t\tTujuan\t\tTanggal");
                System.out.println("====================================================================================================================");
                System.out.println(String.format("%d\t%s",i,dataBarang.get(i)));
            }
            if(!isEditing){
            kembali();
            }
        }
    }
    @Override
    public void dataBarang() {
        try {
            System.out.println("||+++++++++++++++++ DATA BARANG ++++++++++++++++||");
            System.out.println("1. Lihat Barang");
            System.out.println("2. Membuat Data Barang");
            System.out.println("||+++++++++++++++++++++++++++++++++++++||");
            System.out.print("Silahkan Pilih [1/2/3/4/5] : ");
            int Ekspor;
            Ekspor = Integer.valueOf(input.readLine());
            
            switch (Ekspor) {
                case 1 :
                    System.out.println("Lihat Data Tas Luxury");
                    lihatBarang();
                    kembali();
                    break;
                case 2 :
                    System.out.println("Membuat Data Tas Luxury");
                    Scanner masuk = new Scanner (System.in);
                    System.out.print("Kode Barang : ");
                    int nomor = masuk.nextInt();
                    masuk.nextLine();
                    System.out.print("Nama Barang : ");
                    String namaBarang = masuk.nextLine();
                    System.out.print("Jenis Barang : ");
                    String jenis = masuk.nextLine();
                    System.out.print("Status : ");
                    String status = masuk.nextLine();
                    System.out.print("Pengirim : ");
                    String tujuan = masuk.nextLine();
                    System.out.print("Penerima : ");
                    String terima = masuk.nextLine();

                    dataBarang.add(nomor+"\t\t"+namaBarang+"\t\t"+jenis+"\t\t"+status+"\t\t"+tujuan+"\t\t"+terima);
                    lihatBarang();
                    kembali();
                    break;
                case 3 :
                    kembali();
                    break;
                default :
                    System.out.println("\n Inputan Salah\nSilahkan memilih [1-5] ");
            }
        } catch (IOException ex) {
            Logger.getLogger(databarang.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
        
    }
public static void kembali()throws IOException{
        Scanner masuk = new Scanner(System.in);
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        masuk.nextLine();
        
    }
}
