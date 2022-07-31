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

    long anoAtual(long anoInput) {        
        long cal = (anoInput - 10) / 76;
        cal++;
        long calTwo = 10 + cal * 76;
        return calTwo;
    }
    public static void main(String[] args) {        
        Cometa c = new Cometa();
        System.out.println(c.anoAtual(new Scanner(System.in).nextLong()));
    }
    
}
