package posttest6;

public class bukuKelasXII extends Buku {
    private String judulXII;
    private int jumlahXII;
    private String jBuku;
    private int kBuku;

    public bukuKelasXII(String judulXII, int jumlahXII) {
        this.judulXII = judulXII;
        this.jumlahXII = jumlahXII;
    }
    
    public String getJudulXII() {
        return judulXII;
    }

    public void setJudulXII(String judulXII) {
        this.judulXII = judulXII;
    }

    public int getJumlahXII() {
        return jumlahXII;
    }

    public void setJumlahXII(int jumlahXII) {
        this.jumlahXII = jumlahXII;
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