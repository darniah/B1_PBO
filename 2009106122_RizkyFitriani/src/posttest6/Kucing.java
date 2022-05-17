package Posttest6
 


public class Kucing {
    
    private PetShop petshop;

    public Kucing(PetShop petshop) {
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
