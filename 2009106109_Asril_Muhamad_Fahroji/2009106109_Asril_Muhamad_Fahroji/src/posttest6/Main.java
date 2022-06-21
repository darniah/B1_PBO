package posttest6;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static boolean isRunning = true;
    // Menu Login 
    public static void menuLogin() {
        int menu;
        Scanner pilih = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("|      SELAMAT DATANG       |");
        System.out.println("|  di PERPUSTAKAAN SMA N 2  |");
        System.out.println("|        Tana Tidung        |");
        System.out.println("=============================");
        System.out.println("| Masuk sebagai :           |");
        System.out.println("| [1] Admin                 |");
        System.out.println("| [2] User / Siswa          |");
        System.out.println("| [0] Exit                  |");
        System.out.println("=============================");
        System.out.print("> Pilih Menu : ");
        menu = pilih.nextInt();
        switch(menu){
            case 1:
                loginAdmin();
                break;
            case 2:
                loginUser();
                break;
            case 0:
                System.out.println("\nTerimaKasih Telah Berkunjung");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Tidak Ada !!!");
                break;
        }
    }
    // Login Admin / Penjaga Perpustakaan
    public static void loginAdmin() {
        System.out.println("\n=============================");
        System.out.println("| >>  MENU LOGIN ADMIN  <<  |");
        System.out.println("=============================");
        final String nAdmin = "admin123";
        final int kSandi = 101010;
        Scanner input1 = new Scanner(System.in);
        System.out.print(" Masukkan Username : ");
        String admin = input1.nextLine();
        System.out.print(" Masukkan Password : ");
        int ktsandi = input1.nextInt();
        if(admin.equals(nAdmin) && ktsandi == kSandi){
            menuAdmin();
        } else {
            System.out.println("\nUsername & Password salah !!!");
            loginAdmin();
        }
    }
    // Login User / Siswa
    public static void loginUser() {
        ArrayList uname = new ArrayList(); //uname = nama siswa 
        ArrayList pword = new ArrayList(); //pword = nomor induk siswa
        
        System.out.println("\n=============================");
        System.out.println("| >>  MENU LOGIN SISWA  <<  |");
        System.out.println("=============================");
        Scanner input2 = new Scanner(System.in);
        System.out.print("| Masukkan Nama : ");
        uname.add(input2.nextLine());
        System.out.print("| Masukkan NISN : ");
        pword.add(input2.nextInt());
        if(uname.equals(uname) && pword.equals(pword)){
            menuUser();
        } else {
            System.out.println("\nLogin Tidak Berhasil !!!");
            loginUser();
        }
    }
    // Menu Utama Admin
    public static void menuAdmin() {
        int crudB;
        Scanner crudb = new Scanner(System.in);
        System.out.println("\n=============================");
        System.out.println("| >>  MENU UTAMA ADMIN  <<  |");
        System.out.println("=============================");
        System.out.println("| [1] CRUD Buku Kelas X     |");
        System.out.println("| [2] CRUD Buku Kelas XI    |");
        System.out.println("| [3] CRUD Buku Kelas XII   |");
        System.out.println("| [4] Daftar Pengunjung     |");
        System.out.println("| [0] Exit                  |");
        System.out.println("=============================");
        System.out.print("> Pilih Menu : ");
        crudB = crudb.nextInt();
        switch(crudB) {
            case 1:
                crudX();
                break;
            case 2:
                crudXI();
                break;
            case 3:
                crudXII();
                break;
            case 4: 
                siswa();
                break;
            case 0:
                System.out.println("\nTerimakasih Telah Berkunjung");
                System.exit(0);
                break;
            default:
                System.out.println("Menu Tidak Ada !!!");
                menuAdmin();
                break;
        }
    }
    // Menu Utama User
    public static void menuUser() {
        int menu;
        Scanner siswa = new Scanner(System.in);
        System.out.println("\n=============================");
        System.out.println("| >>  MENU UTAMA SISWA  <<  |");
        System.out.println("=============================");
        System.out.println("| [1] Daftar Buku Pelajaran |");
        System.out.println("| [0] Exit                  |");
        System.out.println("=============================");
        System.out.print("> Pilih Menu : ");
        menu = siswa.nextInt();
        switch(menu) {
            case 1:
                kelas();
                bacapinjam();
                break;
            case 0:
                System.out.println("\nTerimakasih Telah Berkunjung");
                System.exit(0);
                break;
            default:
                System.out.println("Menu Tidak Ada !!!");
                menuUser();
                break;
        }
    }
    // CRUD Buku Kelas X
    public static void crudX() {
        int no1;
        ArrayList kelasX = new ArrayList();
        // Read Buku Kelas X
        System.out.println("\n=============================");
        System.out.println("| Daftar Buku Kelas X :     |");
        System.out.println("=============================");
        kelasX.add("Biologi");
        kelasX.add("Fisika");
        kelasX.add("Kimia");
        for(int i = 0; i < kelasX.size(); i++) {
            System.out.println(kelasX.get(i));
        } System.out.println("=============================");
        // Create Buku Kelas XS
        System.out.println("\nTambah Buku Baru");
        Scanner bukuX = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasX.add(bukuX.nextLine());
        // Update Buku Kelas X menggunakan Overridding
        posttest5.bukuKelasX edit = new posttest5.bukuKelasX("", 0);
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku    : ");
        no1 = index.nextInt();
        System.out.print("Masukkan Judul Baru  : ");
        kelasX.set(no1, bukuX.nextLine());
        Scanner jenis = new Scanner(System.in);
        System.out.print("Masukkan Jenis Buku  : ");
        String jenisX = jenis.nextLine();
        Scanner jumlah = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Buku : ");
        int jumlahX = jumlah.nextInt();
        // Hapus Buku Kelas X
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasX.remove(bukuX.nextLine());
        // Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        kelasX.forEach(buku -> {
            System.out.println(buku);
        });
        System.out.println("=============================");
        menuAdmin();
    }
    // CRUD Buku Kelas XI
    public static void crudXI() {
        int no2;
        ArrayList kelasXI = new ArrayList();
        // Read Buku Kelas XI
        System.out.println("\n=============================");
        System.out.println("| Daftar Buku Kelas XI :    |");
        System.out.println("=============================");
        kelasXI.add("Ekonomi");
        kelasXI.add("Gegografi");
        kelasXI.add("Sosiologi");
        for(int i = 0; i < kelasXI.size(); i++) {
            System.out.println(kelasXI.get(i));
        } System.out.println("=============================");
        // Create Buku Kelas XI
        System.out.println("\nTambah Buku Baru");
        Scanner bukuXI = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasXI.add(bukuXI.nextLine());
        // Update Buku Kelas XI menggunakan Overridding
        posttest5.bukuKelasXI edit = new posttest5.bukuKelasXI("", 0);
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no2 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasXI.set(no2, bukuXI.nextLine());
        Scanner jenis = new Scanner(System.in);
        System.out.print("Masukkan Jenis Buku  : ");
        String jenisXI = jenis.nextLine();
        Scanner jumlah = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Buku : ");
        int jumlahXI = jumlah.nextInt();
        // Hapus Buku Kelas XI
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasXI.remove(bukuXI.nextLine());
        // Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        kelasXI.forEach(buku -> {
            System.out.println(buku);
        });
        System.out.println("=============================");
        menuAdmin();
    }
    // CRUD Buku Kelas XII
    public static void crudXII() {
        int no3;
        ArrayList kelasXII = new ArrayList();
        // Read Buku Kelas XII
        System.out.println("\n=============================");
        System.out.println("Daftar Buku Kelas XII :");
        System.out.println("=============================");
        kelasXII.add("Matematika Kelas XII");
        kelasXII.add("Bahasa Inggris Kelas XII");
        kelasXII.add("Seni Budaya Kelas XII");
        for(int i = 0; i < kelasXII.size(); i++) {
            System.out.println(kelasXII.get(i));
        } System.out.println("=============================");
        // Create Buku Kelas XII
        System.out.println("\nTambah Buku Baru");
        Scanner bukuXII = new Scanner(System.in);
        System.out.print("Masukkan Judul Buku : ");
        kelasXII.add(bukuXII.nextLine());
        // Update Buku Kelas XII menggunakan Overridding
        posttest5.bukuKelasXII edit = new posttest5.bukuKelasXII("", 0);
        System.out.println("\nEdit Buku");
        Scanner index = new Scanner(System.in);
        System.out.print("Masukkan No. Buku : ");
        no3 = index.nextInt();
        System.out.print("Masukkan Judul Baru : ");
        kelasXII.set(no3, bukuXII.nextLine());
        Scanner jenis = new Scanner(System.in);
        System.out.print("Masukkan Jenis Buku  : ");
        String jenisXII = jenis.nextLine();
        Scanner jumlah = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Buku : ");
        int jumlahXII = jumlah.nextInt();
        // Hapus Buku Kelas XII
        System.out.println("\nHapus Buku");
        System.out.print("Masukkan Judul Buku : ");
        kelasXII.remove(bukuXII.nextLine());
        // Setelah di CRUD
        System.out.println("\n=============================");
        System.out.println("| Data Buku setelah di CRUD |");
        System.out.println("=============================");
        kelasXII.forEach(buku -> {
            System.out.println(buku);
        });
        System.out.println("=============================");
        menuAdmin();
    }
    // Daftar Buku Pelajaran
    public static void kelas() {
        ArrayList kelas = new ArrayList();
        kelas.add("| Biologi");
        kelas.add("| Ekonomi");
        kelas.add("| Fisika");
        kelas.add("| Geografi");
        kelas.add("| Kimia");
        kelas.add("| Matematika");
        kelas.add("| PPkn");
        kelas.add("| Sejarah");
        kelas.add("| Seni Budaya");
        System.out.println("=============================");
        System.out.println("|   Daftar Buku Pelajaran   |");
        System.out.println("=============================");
        for(int i = 0; i < kelas.size(); i++) {
            System.out.println(kelas.get(i));
        } System.out.println("=============================");
    }
    // Menu Baca & Pinjam Buku
    public static void bacapinjam() {
        methodBuku mBuku = new methodBuku();
        System.out.println("1. Baca buku");
        System.out.println("2. Pinjam buku");
        System.out.println("0. Kembali");
        Scanner pilih = new Scanner(System.in);
        System.out.print("> Pilih : ");
        int menu = pilih.nextInt();
        switch(menu) {
            case 1:
                mBuku.bacaBuku();
                menuUser();
                break;
            case 2:
                mBuku.pinjamBuku();
                menuUser();
                break;
            case 0:
                menuUser();
                break;
            default:
                System.out.println("Input salah");
                bacapinjam();
                break;
        }
    }
    // List Pengunjung Perpustakaan
    public static void siswa() {
        posttest6.Siswa baru = new posttest6.Siswa("", 0, 0);
        baru.setNama("Asril");
        baru.setNisn(100502);
        baru.setKelas(10);
        System.out.println("=============================");
        System.out.println("|  Daftar Nama Pengunjung   |");
        System.out.println("=============================");
        System.out.println("Nama Siswa  : "+baru.getNama());
        System.out.println("NISN        : "+baru.getNisn());
        System.out.println("Kelas       : "+baru.getKelas());
        System.out.println();
        menuAdmin();
    }
    public static void main(String[] args) {       
        do {
            menuLogin();
        } while(isRunning);
    }
}