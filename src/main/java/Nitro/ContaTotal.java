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
public class ContaTotal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int loop = scan.nextInt();
        int sumNumbers = 0;        
        for (int i = 0; i < loop; i++) {
            sumNumbers = sumNumbers + scan.nextInt();            
        }        
        if (sumNumbers == scan.nextInt()) {
            System.out.print("Acertou");
        } else {
            System.out.print("Errou");            
        }
    }
}
