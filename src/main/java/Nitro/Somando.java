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
class Somando {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntNumbersInput = scan.nextInt();       
        long numberInput = 0;
        long sumNumbersInput = 0;
        for (int i = 0; i < qntNumbersInput; i++) {
            numberInput = scan.nextLong();            
            sumNumbersInput += numberInput;            
        }
        System.out.print(sumNumbersInput);
    }
}
