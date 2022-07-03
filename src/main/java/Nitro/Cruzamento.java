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
class Cruzamento {
    long minCruzamento(long mariaPosicaoX, long mariaPosicaoY,
            long reuniaoPosicaoX, long reuniaoPosicaoY) {
        long result = (reuniaoPosicaoX - mariaPosicaoX) 
                + (reuniaoPosicaoY - mariaPosicaoY);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cruzamento cruzamento = new Cruzamento();
        System.out.print(cruzamento.minCruzamento(
                scan.nextLong(),
                scan.nextLong(),
                scan.nextLong(),
                scan.nextLong()));
    }    
}
