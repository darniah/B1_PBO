package POSTTEST6;

/**
 *
 * @author Asus
 */

abstract public class Helm {

// Atribut
    protected String nama;
    protected String merk;
    protected String warna;
    protected String ukuran;
    protected int berat;
    protected int jumlah;
    protected int harga;

//Constructor primary
    Helm(String nama, String merk, String warna, String ukuran, int berat, int jumlah, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.ukuran = ukuran;
        this.berat = berat;
        this.jumlah = jumlah;
        this.harga = harga;
    }

// Overloading
// Default
    Helm() {
        this.nama = "";
        this.merk = "";
        this.warna = "";
        this.ukuran = "";
        this.berat = 0;
        this.jumlah = 0;
        this.harga = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

//Method
    public abstract void tampildata();

    void infotambah() {
        System.out.print("\nData Berhasil di Tambah...\n");
    }

    void infoupdate() {
        System.out.print("\nData Berhasil di Ubah...\n");

    }

    void infodelete() {
        System.out.print("\nData Berhasil di Hapus...\n");
    }

}
