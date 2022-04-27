package praktikum4;

public class Anjing extends PetShop {
    private String petId;
    private String Nama;
    private int tanggalLahir;
    private double beratBadan;
    
    public Anjing(PetShop petshop,String petId, String Nama, int tanggalLahir, double beratBadan) {
        super(petshop.getNo(), petshop.getMerk(), petshop.getJenis(), petshop.getBerat(), petshop.getHarga(), petshop.getKategori());
        this.petId = petId;
        this.Nama = Nama;
        this.tanggalLahir = tanggalLahir;
        this.beratBadan = beratBadan;
    }
    
    
    public Anjing(String petId, String Nama, int tanggalLahir, double beratBadan) {
       super();
       this.petId = petId;
       this.Nama = Nama;
       this.tanggalLahir = tanggalLahir;
       this.beratBadan = beratBadan;
       }

    public Anjing((int No, String Merk, String Jenis, double Berat, double Harga, String Kategori) {
        super(No, Merk, Jenis, Berat, Harga, Kategori);
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public double getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }
}
    
