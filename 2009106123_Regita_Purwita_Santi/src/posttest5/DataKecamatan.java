/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest5;

public abstract class DataKecamatan {
    protected String provinsi;
    protected String kabupaten;
    protected String kecamatan;

    public DataKecamatan(String provinsi, String kabupaten, String kecamatan) {
        this.provinsi = provinsi;
        this.kabupaten = kabupaten;
        this.kecamatan = kecamatan;
    }
    

    protected abstract String getProvinsi();

    protected abstract void setProvinsi(String provinsi);

    protected abstract String getKabupaten();

    protected abstract void setKabupaten(String kabupaten);

    protected abstract String getKecamatan();

    protected abstract void setKecamatan(String kecamatan);
    
    protected abstract void message();
    
    
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
    

