package POSTTEST6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */

public class Main {

    public static void main(String[] args) throws IOException {

        HelmetShopSport hss = new HelmetShopSport();
        HelmetShopClassic hsCL = new HelmetShopClassic();
        ArrayList<HelmSport> helmsport = new ArrayList<>();
        ArrayList<HelmClassic> helmclassic = new ArrayList<>();

        Scanner Masukkan = new Scanner(System.in);

        int ulang = 1;
        while (ulang == 1) {
            System.out.println("\n|-----------------------------|");
            System.out.println("|       HELMET GALLERY        |");
            System.out.println("|--|--------------------------|");
            System.out.println("|1.| Tambah Data Helm         |");
            System.out.println("|2.| Lihat Data Helm          |");
            System.out.println("|3.| Ubah Data Helm           |");
            System.out.println("|4.| Hapus Data Helm          |");
            System.out.println("|5.| Exit                     |");
            System.out.println("|--|--------------------------|");
            int pilih;
            System.out.print("Masukan Pilihan : ");
            pilih = Masukkan.nextInt();
            if (pilih == 1) {
                System.out.println("\n|-----------------------------|");
                System.out.println("|       Tambah Data           |");
                System.out.println("|--|--------------------------|");
                System.out.println("|1.| Tambah Data Helm Sport   |");
                System.out.println("|2.| Tambah Data Helm Classic |");
                System.out.println("|--|--------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hss.tambahDataSport(helmsport);
                } else if (pilih == 2) {
                    hsCL.tambahDataClassic(helmclassic);
                }

            } else if (pilih == 2) {
                System.out.println("\n|-----------------------------|");
                System.out.println("|         Lihat Data          |");
                System.out.println("|--|--------------------------|");
                System.out.println("|1.| Lihat Data Helm Sport    |");
                System.out.println("|2.| Lihat Data Helm Classic  |");
                System.out.println("|--|--------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hss.lihatDataSport(helmsport);
                } else if (pilih == 2) {
                    hsCL.lihatDataClassic(helmclassic);
                }

            } else if (pilih == 3) {
                System.out.println("\n|---------------------------|");
                System.out.println("|          Ubah Data        |");
                System.out.println("|--|------------------------|");
                System.out.println("|1.| Ubah Data Helm Sport   |");
                System.out.println("|2.| Ubah Data Helm Classic |");
                System.out.println("|--|------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hss.ubahDataSport(helmsport);
                } else if (pilih == 2) {
                    hsCL.ubahDataClassic(helmclassic);
                }

            } else if (pilih == 4) {
                System.out.println("\n|----------------------------|");
                System.out.println("|          Hapus Data        |");
                System.out.println("|--|-------------------------|");
                System.out.println("|1.| Hapus Data Helm Sport   |");
                System.out.println("|2.| Hapus Data Helm Classic |");
                System.out.println("|--|-------------------------|");
                System.out.print("Masukan Pilihan : ");
                pilih = Masukkan.nextInt();
                if (pilih == 1) {
                    hss.hapusDataSport(helmsport);
                } else if (pilih == 2) {
                    hsCL.hapusDataClassic(helmclassic);
                }

            } else if (pilih == 5) {
                System.out.println("\nGOOD BYE");
                System.exit(0);
            } else {
                System.out.println("Inputan Yang Anda Masukan Salah !");
            }
        }
    }
}
