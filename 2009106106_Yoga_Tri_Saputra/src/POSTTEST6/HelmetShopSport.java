/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class HelmetShopSport {

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public void tambahDataSport(ArrayList<HelmSport> helm) throws IOException {

        String nama;
        String merk;
        String warna;
        String ukuran;
        String jenis;
        int berat;
        int jumlah;
        int harga;

        HelmSport s = new HelmSport();
        s.form();
        s.waktu();
        System.out.print("\nMasukan Nama         : ");
        nama = r.readLine();
        System.out.print("Masukan Merk Helm    : ");
        merk = r.readLine();
        System.out.print("Masukan Warna Helm   : ");
        warna = r.readLine();
        System.out.print("Masukan Ukuran Helm  : ");
        ukuran = r.readLine();
        System.out.print("Masukan Jenis Helm   : ");
        jenis = r.readLine();
        System.out.print("Masukan Berat Helm   : ");
        berat = Integer.parseInt(r.readLine());
        System.out.print("Masukan Jumlah Helm  : ");
        jumlah = Integer.parseInt(r.readLine());
        System.out.print("Masukan Harga Helm   : ");
        harga = Integer.parseInt(r.readLine());

        HelmSport datahelm = new HelmSport();
        datahelm.setNama(nama);
        datahelm.setMerk(merk);
        datahelm.setWarna(warna);
        datahelm.setUkuran(ukuran);
        datahelm.setJenis(jenis);
        datahelm.setBerat(berat);
        datahelm.setJumlah(jumlah);
        datahelm.setHarga(harga);
        helm.add(datahelm);
        HelmSport.info_tambah(); //Implementasi Static
    }

    public void lihatDataSport(ArrayList<HelmSport> helm) throws IOException {
        if (helm.isEmpty()) {
            System.out.println("\nTidak Ada Data");
        } else {
            for (int i = 0; i < helm.size(); i++) {
                System.out.println("\nData ke-" + (i + 1));
                System.out.println("------------------------");
                helm.get(i).tampildata();
            }
        }
    }

    public void ubahDataSport(ArrayList<HelmSport> helm) throws IOException {
        int ubahID;
        String nama;
        String merk;
        String warna;
        String ukuran;
        String jenis;
        int berat;
        int jumlah;
        int harga;

        lihatDataSport(helm);

        System.out.print("\nMasukkan Data yang Ingin di Ubah: ");
        ubahID = Integer.parseInt(r.readLine());
        int index = ubahID - 1;

        System.out.print("\nMasukan Nama         : ");
        nama = r.readLine();
        System.out.print("Masukan Merk Helm    : ");
        merk = r.readLine();
        System.out.print("Masukan Warna Helm   : ");
        warna = r.readLine();
        System.out.print("Masukan Ukuran Helm  : ");
        ukuran = r.readLine();
        System.out.print("Masukan Jenis Helm   : ");
        jenis = r.readLine();
        System.out.print("Masukan Berat Helm   : ");
        berat = Integer.parseInt(r.readLine());
        System.out.print("Masukan Jumlah Helm  : ");
        jumlah = Integer.parseInt(r.readLine());
        System.out.print("Masukan Harga Helm   : ");
        harga = Integer.parseInt(r.readLine());

        helm.get(index).setNama(nama);
        helm.get(index).setMerk(merk);
        helm.get(index).setWarna(warna);
        helm.get(index).setUkuran(ukuran);
        helm.get(index).setJenis(jenis);
        helm.get(index).setBerat(berat);
        helm.get(index).setJumlah(jumlah);
        helm.get(index).setHarga(harga);
        helm.get(index).infoupdate();
    }

    public void hapusDataSport(ArrayList<HelmSport> helm) throws IOException {

        int ubahID;
        lihatDataSport(helm);

        System.out.print("\nMasukkan Data yang Ingin di Hapus: ");
        ubahID = Integer.parseInt(r.readLine());
        int index = ubahID - 1;

        helm.get(index).infodelete();
        helm.remove(index);

    }

}