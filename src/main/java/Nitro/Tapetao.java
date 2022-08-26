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
public class Tapetao {
    
    int calculo(int comprimento, int qntTapete){
        int calOne = comprimento - (qntTapete -1);        
        return (calOne * calOne) + (qntTapete - 1);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(new Tapetao().calculo(scan.nextInt(), scan.nextInt()));
    }
}
