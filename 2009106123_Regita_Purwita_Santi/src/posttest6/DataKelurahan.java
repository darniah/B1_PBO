
package posttest6;

public class DataKelurahan extends DataKecamatan  {
    protected String desa;
    protected String rtrw;

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

    @Override
    protected void welcome() {
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
