package posttest5;

public class Anjing extends PetShop {

  Anjing(String Nama);

  setNama(Nama);

  Nama = null;

  }

  @Override

  protected void setPetId(String petId) {

      this.petId = petId;

      petId = null;

  }

  @Override

  protected String getPetId() {

      return petId;

  }

  @Override

   protected void setNama(String Nama) {

      this.Nama = Nama;

      Nama = null;

  }

  @Override

  protected String getNama() {

      return Nama;

  }

  @Override

  protected void setTanggalLahir(int tanggalLahir) {

      this.tanggalLahir = tanggalLahir;

      tanggalLahir = null;

  }

  @Override

  protected int getTanggalLahir() {

      return tanggalLahir;

  }

  @Override

  protected void setBeratBadan(double beratBadan) {

      this.beratBadan = beratBadan;

      beratBadan = null;

  }

  @Override

  protected double getBeratBadan() {

      return beratBadan;

  }

    @Override

  protected void tampil() {

    System.out.println("Id hewan peliharaan saya adalah" + getPetId + "yang bernama" + getNama() + "dan lahir pada tanggal" + getTanggalLahir() + "dengan berat badan" + getBeratBadan());

  }

  @Override

  protected void hapus() {

    nama = null;

    petId = null;

    tanggalLahir = null;

    beratBadan = null;

  }

}

