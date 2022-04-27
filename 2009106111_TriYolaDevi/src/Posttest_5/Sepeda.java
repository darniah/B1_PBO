/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Posttest_5;

abstract class Sepeda {
    final int id;
    final String merk;
    final String noseri;
    final String ukuransepeda;
    final String warnasepeda;
    final int jumlahroda;
    final int harga;

    public Sepeda(int id, String merk, String noseri, String ukuransepeda, String warnasepeda, int jumlahroda, int harga) {
        this.id = id;
        this.merk = merk;
        this.noseri = noseri;
        this.ukuransepeda = ukuransepeda;
        this.warnasepeda = warnasepeda;
        this.jumlahroda = jumlahroda;
        this.harga = harga;
    }

    abstract int getHarga();

    abstract void setHarga(int harga);

    abstract int getId();

    abstract void setId(int id);
    
    abstract String getMerk();

    abstract void setMerk(String merk);

    abstract String getNoseri();

    abstract void setNoseri(String noseri);

    abstract String getUkuransepeda(); 

    abstract void setUkuransepeda(String ukuransepeda);

    abstract String getWarnasepeda();

    abstract void setWarnasepeda(String warnasepeda);

    abstract int getJumlahroda(); 

    abstract void setJumlahroda(int jumlahroda);
    
    abstract void TambahData();
    
    abstract void UpdateData();
    
    abstract void HapusData();

    
    //override
    abstract void printNama();
    
    
}

