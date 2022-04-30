package posttest5;

public abstract class PetShop {

    protected int No;

    protected String Merk;

    protected String Jenis;

    protected double Berat;

    protected double Harga;

    protected String Kategori;

    

    public PetShop(int No, String Merk, String Jenis, double Berat, double Harga, String Kategori) {

        this.No = No;

        this.Merk = Merk;

        this.Jenis = Jenis;

        this.Berat = Berat;

        this.Harga = Harga;

        this.Kategori = Kategori;

    }

    public PetShop() {

        this.No = 0;

        this.Merk = "";

        this.Jenis = "";

        this.Berat = 0;

        this.Harga = 0;

        this.Kategori = "";

    }

  // abstract method

    protected abstract void setNo(int No);

    protected abstract int getNo();

    protected abstract void setMerk(String Merk);

    protected abstract String getMerk();

    protected abstract void setJenis(String Jenis);

    protected abstract String getJenis();

    protected abstract void setBerat(double Berat);

    protected abstract double getBerat();

    protected abstract void setHarga(double Harga);

    protected abstract double getHarga();

    protected abstract void setKategori(String Kategori);

    protected abstract String getKategori();

    protected abstract void tampil();

    protected abstract void hapus();

    

  // usual method

  protected void tampilkanMerk(){

    System.out.println("Tampilkan Merk Produk");

  }

}

