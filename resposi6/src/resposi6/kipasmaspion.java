/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resposi6;

/**
 *
 * @author LENOVO
 */
class kipasmaspion  implements kipas{
    private boolean power;
    


    @Override
    public void hidup() {
                power = true;
        System.out.println("kipas berputar...");
        System.out.println("selamat menikmati");
        
    }

    @Override
    public void mati() {
        power = false;
        System.out.println("kipas mati");

    }

    
}

 

