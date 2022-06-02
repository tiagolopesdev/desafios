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
public class SeparandoGrupo {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String name = scan.next();
        
        Integer qntWorldName = name.length();
        System.out.println(qntWorldName);
        
        name = name.replaceAll("[^\p{ASCII}]", "");
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        if (qntWorldName <= 4) {
            System.out.println("GRUPO A");
        } else if (qntWorldName >= 5 && qntWorldName <= 10) {
            System.out.println("GRUPO B");            
        } else if (qntWorldName > 10) {
            System.out.println("GRUPO C");                        
        }
    }
}
