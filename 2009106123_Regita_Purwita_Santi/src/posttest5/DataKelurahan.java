/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest5;


public class DataKelurahan extends DataKecamatan {
    String desa;
    String rtrw;

    public DataKelurahan(String desa, String rtrw, String provinsi, String kabupaten, String kecamatan) {
        super(provinsi, kabupaten, kecamatan);
        this.desa = desa;
        this.rtrw = rtrw;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
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
    
    //Overriding
    protected void message(){
        System.out.println("===================================================");
        System.out.println("           SELAMAT DATANG DALAM PROGRAM            ");
        System.out.println("                  PEMBUATAN KTP                    ");
        System.out.println("===================================================");

    }
    
    void InfoDataKelurahan(String getDesa, String getRtrw){
        System.out.println("---------------------------------------------------");
        System.out.println("                  DATA KELURAHAN                   ");
        System.out.println("          Desa "+ getDesa + " Rt/Rw "+ getRtrw      );
        super.info();
        
    }
    
}
