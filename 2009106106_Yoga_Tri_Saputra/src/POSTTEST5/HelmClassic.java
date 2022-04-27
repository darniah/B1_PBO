package POSTTEST5;

/**
 *
 * @author Asus
 */
public final class HelmClassic extends Helm {

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

    @Override
    final public void tampildata() {
        System.out.println("Kategori    : " + this.kategori);
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
