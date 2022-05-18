/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class PanggilSepeda implements CaraPakai {
    ArrayList<SepedaBalap> dataSepedaBalap = new ArrayList<>();
    ArrayList<SepedaGunung> dataSepedaGunung = new ArrayList<>();
    
    void lihatDataSepedaBalap()throws IOException{
        System.out.println("================DATA SEPEDAH BALAP=============================");
        for (int i = 0; i < dataSepedaBalap.size(); i++){
            System.out.println("Data ke- :" + (i + 1));
            System.out.println("ID Sepeda     : " + dataSepedaBalap.get(i).id);
            System.out.println("Merk Sepeda   : " + dataSepedaBalap.get(i).merk);
            System.out.println("No.Seri Sepeda     : " + dataSepedaBalap.get(i).noseri);
            System.out.println("Ukuran Sepeda : " + dataSepedaBalap.get(i).ukuransepeda);
            System.out.println("Warna Sepeda  : " + dataSepedaBalap.get(i).warnasepeda);
            System.out.println("Jumlah Roda : " + dataSepedaBalap.get(i).jumlahroda);
            System.out.println("Harga Sepeda  : " + dataSepedaBalap.get(i).harga);
            
            int indexe = 0;
            
            dataSepedaBalap.get(indexe).printNama();
        }
    }
    
    void lihatDataSepedaGunung()throws IOException{
        System.out.println("================DATA SEPEDAH GUNUNG=============================");
        for (int i = 0; i < dataSepedaGunung.size(); i++){
            System.out.println("Data ke- :" + (i + 1));
            System.out.println("ID Sepeda     : " + dataSepedaGunung.get(i).id);
            System.out.println("Merk Sepeda   : " + dataSepedaGunung.get(i).merk);
            System.out.println("No.Seri Sepeda     : " + dataSepedaGunung.get(i).noseri);
            System.out.println("Ukuran Sepeda : " + dataSepedaGunung.get(i).ukuransepeda);
            System.out.println("Warna Sepeda  : " + dataSepedaGunung.get(i).warnasepeda);
            System.out.println("Jumlah Roda : " + dataSepedaGunung.get(i).jumlahroda);
            System.out.println("Harga Sepeda  : " + dataSepedaGunung.get(i).harga);
            
            int indexe = 0;
            
            dataSepedaGunung.get(indexe).printNama();
        }
    }
    
    void tambahDataSepedaBalap() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1;
        String input2;
        String input3;
        String input4;
        String input5;
        int input6;
        int input7;

        System.out.print("Masukan ID Sepeda     : ");
        input1 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Merk Sepeda  : ");
        input2 = br.readLine();
        System.out.print("Masukan NO.Seri Sepeda : ");
        input3 = br.readLine();
        System.out.print("Masukan Ukuran Sepeda : ");
        input4 = br.readLine();
        System.out.print("Masukan Warna Sepeda : ");
        input5 = br.readLine();
        System.out.print("Masukan Jumlah Roda Sepeda : ");
        input6 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Harga Sepeda  : ");
        input7 = Integer.parseInt(br.readLine());
        
        SepedaBalap dataTerbaruSB = new SepedaBalap(input1,input2,input3,input4,input5, input6, input7);
        dataSepedaBalap.add(dataTerbaruSB);
        dataTerbaruSB.TambahData();
    }
    
    void tambahDataSepedaGunung() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1;
        String input2;
        String input3;
        String input4;
        String input5;
        int input6;
        int input7;

        System.out.print("Masukan ID Sepeda     : ");
        input1 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Merk Sepeda  : ");
        input2 = br.readLine();
        System.out.print("Masukan NO.Seri Sepeda : ");
        input3 = br.readLine();
        System.out.print("Masukan Ukuran Sepeda : ");
        input4 = br.readLine();
        System.out.print("Masukan Warna Sepeda : ");
        input5 = br.readLine();
        System.out.print("Masukan Jumlah Roda Sepeda : ");
        input6 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Harga Sepeda  : ");
        input7 = Integer.parseInt(br.readLine());
        
        SepedaGunung dataTerbaruSG = new SepedaGunung(input1,input2,input3,input4,input5, input6, input7);
        dataSepedaGunung.add(dataTerbaruSG);
        dataTerbaruSG.TambahData();
    }
    
    void ubahDataSepedaBalap()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1;
        String input2;
        String input3;
        String input4;
        String input5;
        int input6;
        int input7;

        lihatDataSepedaBalap();
         
        System.out.println(" ");

        System.out.print("Masukan Data ke- :");
        int inputid = Integer.parseInt(br.readLine());
        int indexe = inputid-1;

        System.out.print("Masukan ID Sepeda     : ");
        input1 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Merk Sepeda  : ");
        input2 = br.readLine();
        System.out.print("Masukan NO.Seri Sepeda : ");
        input3 = br.readLine();
        System.out.print("Masukan Ukuran Sepeda : ");
        input4 = br.readLine();
        System.out.print("Masukan Warna Sepeda : ");
        input5 = br.readLine();
        System.out.print("Masukan Jumlah Roda Sepeda : ");
        input6 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Harga Sepeda  : ");
        input7 = Integer.parseInt(br.readLine());

        int id = dataSepedaBalap.get(indexe).id;
        String merk = dataSepedaBalap.get(indexe).merk;
        String noseri = dataSepedaBalap.get(indexe).noseri;
        String ukuransepeda = dataSepedaBalap.get(indexe).ukuransepeda;
        String warnasepeda = dataSepedaBalap.get(indexe).warnasepeda;
        int jumlahroda = dataSepedaBalap.get(indexe).jumlahroda;
        int harga = dataSepedaBalap.get(indexe).harga;
        
        dataSepedaBalap.get(indexe).UpdateData();
    }
    
    void ubahDataSepedaGunung()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input1;
        String input2;
        String input3;
        String input4;
        String input5;
        int input6;
        int input7;

        lihatDataSepedaGunung();
         
        System.out.println(" ");

        System.out.print("Masukan Data ke- :");
        int inputid = Integer.parseInt(br.readLine());
        int indexe = inputid-1;

        System.out.print("Masukan ID Sepeda     : ");
        input1 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Merk Sepeda  : ");
        input2 = br.readLine();
        System.out.print("Masukan NO.Seri Sepeda : ");
        input3 = br.readLine();
        System.out.print("Masukan Ukuran Sepeda : ");
        input4 = br.readLine();
        System.out.print("Masukan Warna Sepeda : ");
        input5 = br.readLine();
        System.out.print("Masukan Jumlah Roda Sepeda : ");
        input6 = Integer.parseInt(br.readLine());
        System.out.print("Masukan Harga Sepeda  : ");
        input7 = Integer.parseInt(br.readLine());

        int id = dataSepedaGunung.get(indexe).id;
        String merk = dataSepedaGunung.get(indexe).merk;
        String noseri = dataSepedaGunung.get(indexe).noseri;
        String ukuransepeda = dataSepedaGunung.get(indexe).ukuransepeda;
        String warnasepeda = dataSepedaGunung.get(indexe).warnasepeda;
        int jumlahroda = dataSepedaGunung.get(indexe).jumlahroda;
        int harga = dataSepedaGunung.get(indexe).harga;
        
        dataSepedaGunung.get(indexe).UpdateData();
    }
    
    void hapusDataSepedaBalap()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;
       
        lihatDataSepedaBalap();

        System.out.println("Data yang ingin di hapus");
        System.out.print("Masukan Data ke- :");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        if (dataSepedaBalap.size() > indexd){
            dataSepedaBalap.get(indexd).HapusData();
            dataSepedaBalap.remove(indexd);
            
        }   
    }
    
    void hapusDataSepedaGunung()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputd;
       
        lihatDataSepedaGunung();

        System.out.println("Data yang ingin di hapus");
        System.out.print("Masukan Data ke- :");
        inputd = Integer.parseInt(br.readLine());
        int indexd = inputd-1;
        if (dataSepedaGunung.size() > indexd){
            dataSepedaGunung.get(indexd).HapusData();
            dataSepedaGunung.remove(indexd);
            
        }   
    }
    
    static void pilih()throws IOException{
        System.out.println("||======= SEPEDAH ==========||");
        System.out.println("||1.SEPEDAH BALAP           ||");
        System.out.println("||2.SEPEDAH GUNUNG          ||");
        System.out.println("||==========================||");
        System.out.print("Masukkan Pilihan Anda : ");
    }

    @Override
    public void berjalan() {
        System.out.println("Sepeda Bisa Berjalan");
    }

    @Override
    public void mengerem() {
        System.out.println("Sepeda Bisa Mengerem");
    }

    @Override
    public void belok_kiri() {
        System.out.println("Sepeda Bisa Berbelok ke Kanan");
    }

    @Override
    public void belok_kanan() {
        System.out.println("Sepeda Bisa Berbelok ke Kiri");
    }
}

