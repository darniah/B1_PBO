package Posttest6;

public class BoltSalmon implement PetShop{

    private int food;
    private boolean LihatDataProduk;

    public BoltSalmon() {
        this.food = Bolt;
    }
    
    @Override
    public void LihatDataProduk () {
        isLihatDataProduk = true;
        System.out.println("Produk yang di pilih adalah Bolt");
        System.out.println("Bolt adalah kategori Makanan");
    }
    @Override
    public void TambahDataProduk () {
        isLihatDataProduk = false;
        System.out.println("Data Ditambah");
    }
    @Override
    public void UpdateDataProduk () {
        if (isLihatDataProduk) {
            if (this.food == Merk) {
                System.out.println("Data Produk telah terupdate");
                System.out.println("Produk " + "Update" + this.getFood());
            } else {
                this.food += Bolt;
                System.out.println("Hasil Update : " + this.getFood());
            }
        } else {
            System.out.println("Data Tidak dapat terupdate ");
        }
    }
    @Override
    public void JenisDataProduk () {
        if (isLihatDataProduk) {
            if (this.food == Jenis) {
                System.out.println("Jenis Bolt adalah Pet Food");
            } else {
                this.food -= "Jenis Bolt adalah Litter";
                System.out.println("litter bukan merupakan jenis : " + this.getFood());
            }
        } else {
            System.out.println("Bukan jenis apapun");
        }
    }
    public int getFood() {
        return this.food;
    }
}