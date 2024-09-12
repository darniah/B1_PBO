package posttest4;

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
    
    void InfoDataKelurahan(String getDesa, String getRtrw){
        System.out.println("---------------------------------------------------");
        System.out.println("          Desa "+ getDesa + " Rt/Rw "+ getRtrw      );
        super.info();
        
    }
    
}
