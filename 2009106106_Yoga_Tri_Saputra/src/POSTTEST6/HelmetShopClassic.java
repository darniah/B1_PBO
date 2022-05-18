/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST6;

/**
 *
 * @author Asus
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class HelmetShopClassic {

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public void tambahDataClassic(ArrayList<HelmClassic> helmcl) throws IOException {

        String nama;
        String merk;
        String warna;
        String ukuran;
        String jenis;
        int berat;
        int jumlah;
        int harga;

        HelmClassic s = new HelmClassic();
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

        HelmClassic datahelm = new HelmClassic();
        datahelm.setNama(nama);
        datahelm.setMerk(merk);
        datahelm.setWarna(warna);
        datahelm.setUkuran(ukuran);
        datahelm.setJenis(jenis);
        datahelm.setBerat(berat);
        datahelm.setJumlah(jumlah);
        datahelm.setHarga(harga);
        helmcl.add(datahelm);
        datahelm.infotambah();
    }

    public void lihatDataClassic(ArrayList<HelmClassic> helmcl) throws IOException {
        if (helmcl.isEmpty()) {
            System.out.println("\nTidak Ada Data");
        } else {
            for (int i = 0; i < helmcl.size(); i++) {
                System.out.println("\nData ke-" + (i + 1));
                System.out.println("------------------------");
                helmcl.get(i).tampildata();
            }
        }
    }

    public void ubahDataClassic(ArrayList<HelmClassic> helmcl) throws IOException {
        int ubahID;
        String nama;
        String merk;
        String warna;
        String ukuran;
        String jenis;
        int berat;
        int jumlah;
        int harga;

        lihatDataClassic(helmcl);

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

        helmcl.get(index).setNama(nama);
        helmcl.get(index).setMerk(merk);
        helmcl.get(index).setWarna(warna);
        helmcl.get(index).setUkuran(ukuran);
        helmcl.get(index).setJenis(jenis);
        helmcl.get(index).setBerat(berat);
        helmcl.get(index).setJumlah(jumlah);
        helmcl.get(index).setHarga(harga);
        helmcl.get(index).infoupdate();
    }

    public void hapusDataClassic(ArrayList<HelmClassic> helmcl) throws IOException {

        int ubahID;
        lihatDataClassic(helmcl);

        System.out.print("\nMasukkan Data yang Ingin di Hapus: ");
        ubahID = Integer.parseInt(r.readLine());
        int index = ubahID - 1;

        helmcl.get(index).infodelete();
        helmcl.remove(index);

    }

}