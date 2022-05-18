package POSTTEST6;  
abstract class sepatu {
    //Atribut-----------------------------------------
    protected String KodeBarang;
    protected String Jenis;
    protected String Brand;
    protected int    Ukuran;
    protected String Warna;
    protected int    Harga;
 
    // konstruktor------------------------------------
    sepatu(String P_KodeBarang,
           String P_Jenis,
           String P_Brand,
           int    P_Ukuran,
           String P_Warna,
           int    P_Harga){
        this.KodeBarang  = P_KodeBarang;
        this.Jenis       = P_Jenis;
        this.Brand       = P_Brand;
        this.Ukuran      = P_Ukuran;
        this.Warna       = P_Warna;
        this.Harga       = P_Harga;
    }
    sepatu(){
        this.KodeBarang  = "-";
        this.Jenis       = "-";
        this.Brand       = "-";
        this.Ukuran      = 0;
        this.Warna       = "-";
        this.Harga       = 0;
    }
    // method untuk Tampilkan Objek ------------------
    abstract void print();

    abstract void print2();

    public String getKodeBarang() {
        return KodeBarang;
    }

    public void setKodeBarang(String KodeBarang) {
        this.KodeBarang = KodeBarang;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getUkuran() {
        return Ukuran;
    }

    public void setUkuran(int Ukuran) {
        this.Ukuran = Ukuran;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
}
