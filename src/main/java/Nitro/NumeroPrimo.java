/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.*;

/**
 *
 * @author tiago
 */
public class NumeroPrimo {

    long qntDivisor;
    
    public String verificaNumber(long numberInput) {        
        if (numerosDivisores(numberInput) == 2) {
            return "sim";
        }
        return "nao";
    }
    long numerosDivisores(long numberDivisor){
        for (int j = 1; j <= numberDivisor; j++) {
            if (numberDivisor % j == 0) qntDivisor++;
        }
        return qntDivisor;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumeroPrimo numeroPrimo = new NumeroPrimo();
        System.out.print(numeroPrimo.verificaNumber(scan.nextLong()));
    }
}
