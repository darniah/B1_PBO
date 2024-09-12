package posttest5;

public class bukuKelasXI extends Buku {
    private String judulXI;
    private int jumlahXI;
    private String jBuku;
    private int kBuku;

    public bukuKelasXI(String judulXI, int jumlahXI) {
        this.judulXI = judulXI;
        this.jumlahXI = jumlahXI;
    }
    
    public String getJudulXI() {
        return judulXI;
    }

    public void setJudulXI(String judulXI) {
        this.judulXI = judulXI;
    }

    public int getJumlahXI() {
        return jumlahXI;
    }

    public void setJumlahXI(int jumlahXI) {
        this.jumlahXI = jumlahXI;
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