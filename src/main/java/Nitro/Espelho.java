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
public class Espelho {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Integer number = scan.nextInt();
        
        while (number != 0) {
            number *= -1;
            System.out.println(number);
            number = scan.nextInt();
        }
    }
}
