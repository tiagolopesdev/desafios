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
public class Insensibilidade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qntLoop = scan.nextInt();
        
        int xOne = 0;
        int xTwo = 0;        
        int yOne = 0;
        int yTwo = 0;       
        int diferencaX = 0;
        int diferencaY = 0;
        int total = 0;
        
        for (int i = 0; i < qntLoop; i++) {
            xOne = scan.nextInt();            
            yOne = scan.nextInt();
            xTwo = scan.nextInt();
            yTwo = scan.nextInt();            
            if (!(xOne == xTwo)) {               
                diferencaX = xOne - xTwo;
                diferencaX = diferencaX * diferencaX;
                total += diferencaX;                
            }
            if (!(yOne == yTwo)) {                
                diferencaY = yOne - yTwo;
                diferencaY = diferencaY * diferencaY;
                total += diferencaY;               
            }
        }
        System.out.print(total);
    }
}
