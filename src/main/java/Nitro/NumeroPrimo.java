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

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        long numberInput = scan.nextInt();
        
        long divisor = 0;
        
        for (int i = 0; i < numberInput; i++) {
            if (numberInput % i == 0) {
                divisor++;                
            }
        }
        if (divisor == 2) {
            System.out.print("sim");
        } else {
            System.out.print("nao");            
        }
    }
}
