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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int l = scan.nextInt();
        int n = scan.nextInt();
        
        int calOne = (l - (n - 1));
        int calTwo = (calOne * calOne) + (n - 1); 
        System.out.println(calTwo);
    }
}
