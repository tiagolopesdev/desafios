/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.util.Scanner;

/**
 *
 * @author tiagolopes
 */
public class CaozinhoPoodle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double n, p, result;
        
        n = scan.nextFloat();
        p = scan.nextFloat();
        
        while (n != 0 && p != 0) {            
            result = Math.ceil(n / p);
            if (result <= 6) {
                System.out.println("Poodle");
            } else if (result > 20) {
                System.out.println("Poooooooooooooooodle");                
            } else {
                result = result - 4;
                System.out.print("P");
                while (result != 0) {
                    System.out.print("o");
                    result--;
                }
                System.out.println("dle");                
            }
            n = scan.nextFloat();
            p = scan.nextFloat();            
        }
    }
}
