package POSTTEST6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Asus
 */

public final class HelmClassic extends Helm implements Struk {

    private String jenis;
    final String kategori = "Helm Classic";

    public HelmClassic(String nama, String merk, String warna, String ukuran, int berat, int jumlah, int harga) {
        super(nama, merk, warna, ukuran, berat, jumlah, harga);
    }

    public HelmClassic() {
        this.jenis = "";
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void form() {
        System.out.println("\n====== Form Penjualan Helm Classic ======");
    }

    public void waktu() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("          dd-MM-yyyy HH:mm:ss");
        String formatdatetime = now.format(formatter);
        System.out.println(formatdatetime);
    }

    @Override
    final public void tampildata() {
        form();
        waktu();
        System.out.println("\nKategori    : " + this.kategori);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Merk Helm   : " + this.merk);
        System.out.println("Warna Helm  : " + this.warna);
        System.out.println("Ukuran Helm : " + this.ukuran);
        System.out.println("Jenis Helm  : " + this.jenis);
        System.out.println("Berat Helm  : " + this.berat);
        System.out.println("Jumlah Helm : " + this.jumlah);
        System.out.println("Harga Helm  : " + this.harga);
    }

    @Override
    final public void infotambah() {
        System.out.print("\nData Helm Classic Berhasil di Tambah...\n");
    }

    @Override
    final public void infoupdate() {
        System.out.print("\nData Helm Classic Berhasil di Ubah...\n");

    }

    @Override
    final public void infodelete() {
        System.out.print("\nData Helm Classic Berhasil di Hapus...\n");
    }

}
