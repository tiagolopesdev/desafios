/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.Scanner;

/**
 *
 * @author tiago
 */
public class Cometa {
    
    int VOLTA_TORNO_SOL = 76;
    int PRIMEIRO_ANO = 10;

    long anoAtual(long anoInput) {        
        long calculation = (anoInput - PRIMEIRO_ANO) / VOLTA_TORNO_SOL + 1;                
        return PRIMEIRO_ANO + calculation * VOLTA_TORNO_SOL;
    }
    public static void main(String[] args) {                
        System.out.println(new Cometa().anoAtual(new Scanner(System.in).nextLong()));        
    }    
}
