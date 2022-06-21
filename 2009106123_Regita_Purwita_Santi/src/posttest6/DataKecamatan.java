
package posttest6;

public abstract class DataKecamatan {
    private String provinsi;
    private String kabupaten;
    private String kecamatan;

    public DataKecamatan(String provinsi, String kabupaten, String kecamatan) {
        this.provinsi = provinsi;
        this.kabupaten = kabupaten;
        this.kecamatan = kecamatan;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    
    
    protected abstract void welcome();
    
    
    // Overloading
    void info(){
        System.out.println("\t\t   >> Berhasil Diinput <<");
        System.out.println("---------------------------------------------------");
    }
    
    void info(String getProvinsi, String getKabupaten, String getKecamatan){
        System.out.println("---------------------------------------------------");
        System.out.println("                      DATA KECAMATAN               ");
        System.out.println("Prov. "+ getProvinsi + " Kab. "+ getKabupaten + " Kec. " + getKecamatan);
        
        
    }
}
