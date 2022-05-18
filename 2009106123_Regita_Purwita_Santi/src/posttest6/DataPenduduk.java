/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest6;

//Final Class
public final class DataPenduduk extends DataKelurahan implements Message {
    private final String x = "DATA PENDUDUK"; //Final Property
    private int nik;
    private String status;
    private String nama;
    private String ttl;
    private String jk;
    private String agama;
    private String goldar;
    private String kewarganegaraan;
    private String alamat;

    public DataPenduduk(int nik, String nama, String ttl, String jk, String agama,String status, String goldar, String kewarganegaraan, String alamat,String provinsi, String kabupaten, String kecamatan, String desa, String rtrw) {
        super(desa, rtrw, provinsi, kabupaten, kecamatan);
        this.nik = nik;
        this.nama = nama; 
        this.ttl = ttl;
        this.jk = jk;
        this.agama = agama;
        this.status = status;
        this.goldar = goldar;
        this.kewarganegaraan = kewarganegaraan;
        this.alamat = alamat; 
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    // Final Method
    final void InfoDataPenduduk(){
        System.out.println("---------------------------------------------------");
        System.out.println("\t\t\t" + x);
        super.info();
    }
    

    @Override
    public void messageInsertData() {
        System.out.println("=========================================================");
        System.out.println("             DATA KTP BERHASIL DITAMBAHKAN               ");
        System.out.println("=========================================================");
    }

    @Override
    public void messageDeleteData() {
        System.out.println("=========================================================");
        System.out.println("               DATA KTP BERHASIL DIHAPUS                 ");
        System.out.println("=========================================================");
    }

    @Override
    public void messageUpdateData() {
        System.out.println("=========================================================");
        System.out.println("              DATA KTP BERHASIL DIUPDATE                 ");
        System.out.println("=========================================================");
    }

    @Override
    public void messageThanks() {
        System.out.println("=========================================================");
        System.out.println("             TERIMAKASIH TELAH MENGGUNAKAN               ");
        System.out.println("                PPROGRAM PEMBUATAN KTP                   ");
        System.out.println("=========================================================");
    }
    
}
  
