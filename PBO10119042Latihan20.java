/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Stks
 */
public class IF110119042Latihan20 {
    public static void main(String[] args){
        double saldoawal = 3500000;
        double i =0;
        do {
            i += 1;
            saldoawal += Math.floor(saldoawal * 0.08);
            System.out.printf("Saldo di bulan ke- %1$.0f Rp.%2$,.0f%n", i, saldoawal);
        }while(saldoawal<6000000);
    }
    
}
