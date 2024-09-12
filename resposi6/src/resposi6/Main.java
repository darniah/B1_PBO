/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resposi6;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        //create objek kipas
        kipas maspion = new kipasmaspion () ;
        //create objek untuk pengguna
        kipaslidya lidya = new kipaslidya(maspion);
        
        //lidya.hidupkankipas();
        
        Scanner input = new Scanner(System.in);
        String pilihan; 
        while (true) {
            System.out.println("=== perintah on/of kipas ===");
            System.out.println("[1] hidupkan kipas");
            System.out.println("[2] Matikan kipas");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih> ");
            pilihan = input.nextLine();
            
            if(pilihan.equalsIgnoreCase("1")){
                lidya.hidupkankipas();
            } else if (pilihan.equalsIgnoreCase("2")){
                lidya.matikankipas();
            } else if (pilihan.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("pilihan salah!");
            }
        }

    }
}
