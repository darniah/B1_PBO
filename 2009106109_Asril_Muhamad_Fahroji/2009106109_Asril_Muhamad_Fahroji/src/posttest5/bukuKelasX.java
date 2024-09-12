package posttest5;

public class bukuKelasX extends Buku {
    private String judulX;
    private int jumlahX;
    private String jBuku;
    private int kBuku;

    public bukuKelasX(String judulX, int jumlahX) {
        this.judulX = judulX;
        this.jumlahX = jumlahX;
    }

    public String getJudulX() {
        return judulX;
    }

    public void setJudulX(String judulX) {
        this.judulX = judulX;
    }

    public int getJumlahX() {
        return jumlahX;
    }

    public void setJumlahX(int jumlahX) {
        this.jumlahX = jumlahX;
    }

    @Override
    public String jBuku() {
        String jenisBuku = "";
        return this.jBuku = jenisBuku;
    }

    @Override
    public int kBuku() {
        int kodeBuku = 0;
        return this.kBuku = kodeBuku;
    }
}