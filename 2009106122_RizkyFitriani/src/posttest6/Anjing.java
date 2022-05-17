package Posttest6
 


public class Anjing {
    
    private PetShop petshop;

    public Anjing(PetShop petshop) {
        this.petshop = petshop;
    }
    
    void pilihanLihatDataProduk(){
        this.petshop.LihatDataProduk();
    }
    
    void pilihanTambahDataProduk(){
        this.petshop.TambahDataProduk();
    }
    
    void pilihanUpdateDataProduk(){
        this.petshop.UpdateDataProduk();
    }
    
    void pilihanHapusDataProduk(){
        this.petshop.HapusDataProduk();
    }
}
