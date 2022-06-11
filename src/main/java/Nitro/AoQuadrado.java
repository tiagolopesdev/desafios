/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nitro;

import java.util.*;

/**
 *
 * @author tiagolopes
 */
public class AoQuadrado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Integer numberInput = scan.nextInt();
        
        System.out.printf("%.0f", Math.pow(numberInput, 2));
    }
}
