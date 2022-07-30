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
public class PistaCorrida {
    
    public static void main(String[] args) throws java.lang.Exception {        
        Scanner scan = new Scanner(System.in);

        int metrosCorrer = scan.nextInt();
        int compriPista = scan.nextInt();

        System.out.print(metrosCorrer % compriPista);
    }
}
