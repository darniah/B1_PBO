/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST6;

import java.util.ArrayList;

/**
 *
 * @author MSi-GAMING
 */
public interface CrudMenu {
    public void tambahDataSepatu(ArrayList<Sepatu> dataSepatu);
    public void tambahDataSandal(ArrayList<Sandal> dataSandal);
    public void ubahDataSepatu(ArrayList<Sepatu> dataSepatu);
    public void ubahDataSandal(ArrayList<Sandal> dataSandal);
    public void hapusDataSepatu(ArrayList<Sepatu> dataSepatu);
    public void hapusDataSandal(ArrayList<Sandal> dataSandal);
    public void lihatDataSepatu(ArrayList<Sepatu> dataSepatu);
    public void lihatDataSandal(ArrayList<Sandal> dataSandal);
}
