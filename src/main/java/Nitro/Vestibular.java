/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nitro;

import java.util.*;

/**
 *
 * @author tiago
 */
public class Vestibular {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int questions = Integer.parseInt(scan.nextLine());
        String gabarito = scan.nextLine();
        String markeds = scan.nextLine();
               
        int qntHits = 0;
        
        for (int i = 0; i < questions; i++) {
            if (gabarito.charAt(i) == markeds.charAt(i)) {
                qntHits++;
            }
        }
        System.out.print(qntHits);
    }
}
