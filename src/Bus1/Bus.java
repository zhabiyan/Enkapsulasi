/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus1;

/**
 *
 * @author Zhabiyan
 */
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    public void cetak(){ //method cetak
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
