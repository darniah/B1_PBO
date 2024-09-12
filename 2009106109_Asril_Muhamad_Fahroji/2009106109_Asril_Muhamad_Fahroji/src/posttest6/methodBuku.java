package posttest6;

import java.util.Scanner;
import static posttest6.Main.bacapinjam;
public class methodBuku implements bukuInterface {

    @Override
    public void bacaBuku() {
        posttest6.Siswa nama = new posttest6.Siswa("", 0, 0);
        System.out.println("\n=============================");
        Scanner nSiswa = new Scanner(System.in);
        System.out.print("Nama siswa : ");
        nama.setNama(nSiswa.nextLine());
        Scanner pilih = new Scanner(System.in);
        System.out.println("Kelas X = 10\nKelas XI = 11\nKelas XII = 12");
        System.out.print("Pilih Kategori Buku : ");
        int kelas = pilih.nextInt();
        switch (kelas) {
            case 10:
                {
                    posttest6.bukuKelasX bacaX = new posttest6.bukuKelasX("", 0);
                    Scanner bukuX = new Scanner(System.in);
                    System.out.print("Nama Buku : ");
                    bacaX.setJudulX(bukuX.nextLine());
                    System.out.println("\n=============================");
                    System.out.println("| Nama siswa : "+nama.getNama());
                    System.out.println("| Nama buku  : "+bacaX.getJudulX());
                    System.out.println("| Buku kelas : "+kelas);
                    System.out.println("=============================");
                    bacapinjam();
                    break;
                }
            case 11:
                {
                    posttest6.bukuKelasXI bacaXI = new posttest6.bukuKelasXI("", 0);
                    Scanner bukuXI = new Scanner(System.in);
                    System.out.print("Nama Buku : ");
                    bacaXI.setJudulXI(bukuXI.nextLine());
                    System.out.println("\n=============================");
                    System.out.println("| Nama siswa : "+nama.getNama());
                    System.out.println("| Nama buku  : "+bacaXI.getJudulXI());
                    System.out.println("| Buku kelas : "+kelas);
                    System.out.println("=============================");
                    bacapinjam();
                    break;
                }
            case 12:
                {
                    posttest6.bukuKelasXII bacaXII = new posttest6.bukuKelasXII("", 0);
                    Scanner bukuXII = new Scanner(System.in);
                    System.out.print("Nama Buku : ");
                    bacaXII.setJudulXII(bukuXII.nextLine());
                    System.out.println("\n=============================");
                    System.out.println("| Nama siswa : "+nama.getNama());
                    System.out.println("| Nama buku  : "+bacaXII.getJudulXII());
                    System.out.println("| Buku kelas : "+kelas);
                    System.out.println("=============================");
                    bacapinjam();
                    break;
                }
            default:
                break;
        }
    }

    @Override
    public void pinjamBuku() {
        posttest6.Siswa siswa = new posttest6.Siswa("", 0, 0);
        System.out.println("\n=============================");
        Scanner namaS = new Scanner(System.in);
        System.out.print("Masukkan Nama siswa : ");
        siswa.setNama(namaS.nextLine());
        Scanner nisnS = new Scanner(System.in);
        System.out.print("Masukkan NISN siswa : ");
        siswa.setNisn(nisnS.nextInt());
        Scanner pilih = new Scanner(System.in);
        System.out.println("Kelas X = 10\nKelas XI = 11\nKelas XII = 12");
        System.out.print("Pilih Kategori Buku : ");
        int kelas = pilih.nextInt();
        switch(kelas) {
            case 10:
                posttest6.bukuKelasX pinjamX = new posttest6.bukuKelasX("", 0);
                Scanner bukuX = new Scanner(System.in);
                System.out.print("Masukkan Nama Buku  : ");
                pinjamX.setJudulX(bukuX.nextLine());
                Scanner jumlahX = new Scanner(System.in);
                System.out.print("Jumlah Buku yg dipinjam : ");
                pinjamX.setJumlahX(jumlahX.nextInt());
                System.out.println("\n=============================");
                System.out.println("| Nama siswa  : "+siswa.getNama());
                System.out.println("| NISN siswa  : "+siswa.getNisn());
                System.out.println("| Nama buku   : "+pinjamX.getJudulX());
                System.out.println("| Buku kelas  : "+kelas);
                System.out.println("| Jumlah buku : "+pinjamX.getJumlahX());
                System.out.println("=============================");
                bacapinjam();
                break;
            case 11:
                posttest6.bukuKelasXI pinjamXI = new posttest6.bukuKelasXI("", 0);
                Scanner bukuXI = new Scanner(System.in);
                System.out.print("Masukkan Nama Buku  : ");
                pinjamXI.setJudulXI(bukuXI.nextLine());
                Scanner jumlahXI = new Scanner(System.in);
                System.out.print("Jumlah Buku yg dipinjam : ");
                pinjamXI.setJumlahXI(jumlahXI.nextInt());
                System.out.println("\n=============================");
                System.out.println("| Nama siswa  : "+siswa.getNama());
                System.out.println("| NISN siswa  : "+siswa.getNisn());
                System.out.println("| Nama buku   : "+pinjamXI.getJudulXI());
                System.out.println("| Buku kelas  : "+kelas);
                System.out.println("| Jumlah buku : "+pinjamXI.getJumlahXI());
                System.out.println("=============================");
                bacapinjam();
                break;
            case 12:
                posttest6.bukuKelasXII pinjamXII = new posttest6.bukuKelasXII("", 0);
                Scanner bukuXII = new Scanner(System.in);
                System.out.print("Masukkan Nama Buku  : ");
                pinjamXII.setJudulXII(bukuXII.nextLine());
                Scanner jumlahXII = new Scanner(System.in);
                System.out.print("Jumlah Buku yg dipinjam : ");
                pinjamXII.setJumlahXII(jumlahXII.nextInt());
                System.out.println("\n=============================");
                System.out.println("| Nama siswa  : "+siswa.getNama());
                System.out.println("| NISN siswa  : "+siswa.getNisn());
                System.out.println("| Nama buku   : "+pinjamXII.getJudulXII());
                System.out.println("| Buku kelas  : "+kelas);
                System.out.println("| Jumlah buku : "+pinjamXII.getJumlahXII());
                System.out.println("=============================");
                bacapinjam();
                break;
            default:
                break;
        }
    }
}