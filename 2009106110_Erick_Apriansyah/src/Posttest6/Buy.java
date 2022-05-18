package Posttest6;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Asus
 */
class Buy extends Market implements Count {

    //sub-class beli dari market
    private int quantity;
    public Buy(int quantity, int no, String nama, String jenis, int price, String game) {
        super(no, nama, jenis, price, game);
        this.quantity = quantity;
    }

    public Buy() {
        this.quantity = 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void penghitungTotalHarga(int harga,int quantity){
        int total_harga = harga*quantity;
        System.out.println("Total Harga         : "+total_harga);
    }
    public void penghitungTotalHarga2(int harga,int quantity){
        int total_harga = harga*quantity;
        System.out.println("Total Harga = "+total_harga);
    }
    public void tanggal(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatdatetime = now.format(formatter);
        System.out.println("Tanggal Pembelian "+formatdatetime);
    }
    static public void label(){
        System.out.println("\n====Form Pembelian====");
    }
    @Override
    final public void barangSukes() {
        System.out.println("Barang ditambahkan ke dalam Daftar Pembelian");
    }

    @Override
    final public void barangGagal() {
        System.out.println("Barang dihapus dari Daftar Pembelian ");
    }

    @Override
    final public void barangDiubah() {
        System.out.println("Barang dalam daftar pembelian telah diupdate ");
    }
}
